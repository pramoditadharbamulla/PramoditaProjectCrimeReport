package com.java.junit;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

import com.java.Crime.model.Gender;
import com.java.Crime.model.Victim;

public class VictimTestCase {

    @Test
    public void testConstructor() {
        Victim victim = new Victim();
        assertNotNull(victim);

        Victim victim1 = new Victim(1, "John", "Doe", Date.valueOf("1990-01-01"), Gender.MALE, "555-1234", "123 Main St");
        assertEquals(1, victim1.getVictimID());
        assertEquals("John", victim1.getFirstName());
        assertEquals("Doe", victim1.getLastName());
        assertEquals(Date.valueOf("1990-01-01"), victim1.getDateOfBirth());
        assertEquals(Gender.MALE, victim1.getGender());
        assertEquals("555-1234", victim1.getPhoneNumber());
        assertEquals("123 Main St", victim1.getAddress());
    }

    @Test
    public void testGettersAndSetters() {
        Victim victim = new Victim();
        victim.setVictimID(1);
        victim.setFirstName("John");
        victim.setLastName("Doe");
        victim.setDateOfBirth(Date.valueOf("1990-01-01"));
        victim.setGender(Gender.MALE);
        victim.setPhoneNumber("555-1234");
        victim.setAddress("123 Main St");

        assertEquals(1, victim.getVictimID());
        assertEquals("John", victim.getFirstName());
        assertEquals("Doe", victim.getLastName());
        assertEquals(Date.valueOf("1990-01-01"), victim.getDateOfBirth());
        assertEquals(Gender.MALE, victim.getGender());
        assertEquals("555-1234", victim.getPhoneNumber());
        assertEquals("123 Main St", victim.getAddress());
    }

    @Test
    public void testHashCode() {
        Victim victim1 = new Victim(1, "John", "Doe", Date.valueOf("1990-01-01"), Gender.MALE, "555-1234", "123 Main St");
        Victim victim2 = new Victim(1, "John", "Doe", Date.valueOf("1990-01-01"), Gender.MALE, "555-1234", "123 Main St");
        assertEquals(victim1.hashCode(), victim2.hashCode());
    }

    @Test
    public void testEquals() {
        Victim victim1 = new Victim(1, "John", "Doe", Date.valueOf("1990-01-01"), Gender.MALE, "555-1234", "123 Main St");
        Victim victim2 = new Victim(1, "John", "Doe", Date.valueOf("1990-01-01"), Gender.MALE, "555-1234", "123 Main St");
        Victim victim3 = new Victim(2, "Jane", "Doe", Date.valueOf("1992-02-02"), Gender.FEMALE, "555-5678", "456 Elm St");

        assertTrue(victim1.equals(victim2));
        assertFalse(victim1.equals(victim3));
    }

    @Test
    public void testToString() {
        Victim victim = new Victim(1, "John", "Doe", Date.valueOf("1990-01-01"), Gender.MALE, "555-1234", "123 Main St");
        String expected = "Victim [victimID=1, FirstName=John, LastName=Doe, DateOfBirth=1990-01-01, Gender=MALE, PhoneNumber=555-1234, Address=123 Main St]";
        assertEquals(expected, victim.toString());
    }
}
