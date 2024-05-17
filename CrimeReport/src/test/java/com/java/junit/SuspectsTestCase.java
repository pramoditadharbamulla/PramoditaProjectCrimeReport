package com.java.junit;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

import com.java.Crime.model.Gender;
import com.java.Crime.model.Suspects;

public class SuspectsTestCase {

    @Test
    public void testConstructor() {
        Suspects suspect = new Suspects();
        assertNotNull(suspect);

        Suspects suspect1 = new Suspects(1, "John", "Doe", Date.valueOf("1990-01-01"), Gender.MALE, "555-1234", "123 Main St");
        assertEquals(1, suspect1.getSuspectID());
        assertEquals("John", suspect1.getFirstName());
        assertEquals("Doe", suspect1.getLastName());
        assertEquals(Date.valueOf("1990-01-01"), suspect1.getDateOfBirth());
        assertEquals(Gender.MALE, suspect1.getGender());
        assertEquals("555-1234", suspect1.getPhoneNumber());
        assertEquals("123 Main St", suspect1.getAddress());
    }

    @Test
    public void testGettersAndSetters() {
        Suspects suspect = new Suspects();
        suspect.setSuspectID(1);
        suspect.setFirstName("John");
        suspect.setLastName("Doe");
        suspect.setDateOfBirth(Date.valueOf("1990-01-01"));
        suspect.setGender(Gender.MALE);
        suspect.setPhoneNumber("555-1234");
        suspect.setAddress("123 Main St");

        assertEquals(1, suspect.getSuspectID());
        assertEquals("John", suspect.getFirstName());
        assertEquals("Doe", suspect.getLastName());
        assertEquals(Date.valueOf("1990-01-01"), suspect.getDateOfBirth());
        assertEquals(Gender.MALE, suspect.getGender());
        assertEquals("555-1234", suspect.getPhoneNumber());
        assertEquals("123 Main St", suspect.getAddress());
    }

    @Test
    public void testHashCode() {
        Suspects suspect1 = new Suspects(1, "John", "Doe", Date.valueOf("1990-01-01"), Gender.MALE, "555-1234", "123 Main St");
        Suspects suspect2 = new Suspects(1, "John", "Doe", Date.valueOf("1990-01-01"), Gender.MALE, "555-1234", "123 Main St");
        assertEquals(suspect1.hashCode(), suspect2.hashCode());
    }

    @Test
    public void testEquals() {
        Suspects suspect1 = new Suspects(1, "John", "Doe", Date.valueOf("1990-01-01"), Gender.MALE, "555-1234", "123 Main St");
        Suspects suspect2 = new Suspects(1, "John", "Doe", Date.valueOf("1990-01-01"), Gender.MALE, "555-1234", "123 Main St");
        Suspects suspect3 = new Suspects(2, "Jane", "Doe", Date.valueOf("1992-02-02"), Gender.FEMALE, "555-5678", "456 Elm St");

        assertTrue(suspect1.equals(suspect2));
        assertFalse(suspect1.equals(suspect3));
    }

    @Test
    public void testToString() {
        Suspects suspect = new Suspects(1, "John", "Doe", Date.valueOf("1990-01-01"), Gender.MALE, "555-1234", "123 Main St");
        String expected = "Suspects [SuspectID=1, FirstName=John, LastName=Doe, DateOfBirth=1990-01-01, Gender=MALE, PhoneNumber=555-1234, Address=123 Main St]";
        assertEquals(expected, suspect.toString());
    }
}
