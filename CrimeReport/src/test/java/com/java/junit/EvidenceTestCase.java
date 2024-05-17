package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.Crime.model.Evidence;

public class EvidenceTestCase {

	@Test
	public void testConstructor() {
		Evidence evidence = new Evidence();
		assertNotNull(evidence);
		Evidence evi = new Evidence(1,"Hair Sample","1st Balcony",1);
		assertEquals(1, evi.getEvidenceID(),1);
		assertEquals("Hair Sample" , evi.getDescription());
		assertEquals("1st Balcony", evi.getLocationFound());
		assertEquals(1, evi.getIncidentID());
		
	}
	@Test
	public void testGettersAndSetters() {
		Evidence evidence = new Evidence();
		evidence.setEvidenceID(1);
		evidence.setDescription("Hair Sample");
		evidence.setLocationFound("1st Balcony");
		evidence.setIncidentID(1);
		assertEquals(1, evidence.getEvidenceID());
		assertEquals("Hair Sample" , evidence.getDescription());
		assertEquals("1st Balcony", evidence.getLocationFound());
		assertEquals(1, evidence.getIncidentID());
		
	}
	
	@Test
	public void testHashCode() {
		Evidence evi = new Evidence(1,"Hair Sample","1st Balcony",1);
		Evidence evi1 = new Evidence(1,"Hair Sample","1st Balcony",1);
		assertEquals(evi.hashCode(), evi1.hashCode());
	}
	
	@Test
	public void testEquals() {
		Evidence evi = new Evidence(1,"Hair Sample","1st Balcony",1);
		Evidence evi1 = new Evidence(1,"Hair Sample","1st Balcony",1);
		Evidence evi2 = new Evidence(3,"Hair Sample","1st Balcony",1);
		assertTrue(evi.equals(evi1));
		assertFalse(evi.equals(evi2));
	}
	
	@Test
	public void testToString() {
		Evidence evi = new Evidence(1,"Hair Sample","1st Balcony",1);
		String result="Evidence [EvidenceID=1, Description=Hair Sample, LocationFound=1st Balcony, IncidentID=1]";
		assertEquals(evi.toString(), result);
		
	}

}