package com.java.junit;

import static org.junit.Assert.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.java.Crime.model.Incidents;

public class IncidentsTestCase {
	

	
	@Test
	public void testConstructors() throws ParseException {
		Incidents incid3= new Incidents();
		assertNotNull(incid3);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Incidents incid= new Incidents(111,"robbery",sdf.parse("2024-09-07"),63.456,-09.897,"robbery","open",19,5);
		assertEquals(111,incid.getIncidentID() );
		assertEquals("robbery",incid.getIncidentType());
		assertEquals(sdf.parse("2024-09-07"),incid.getIncidentDate());
		assertEquals(63.456,incid.getLatitude(),3);
		assertEquals(-09.897,incid.getLongitude(),3);
	
		assertEquals("robbery",incid.getDescription());
		assertEquals("open",incid.getStatus());
		assertEquals(19,incid.getVictimID());
		assertEquals(5,incid.getSuspectID());
	}
		@Test
		
		public void testGettersAndSetters() throws ParseException {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Incidents incid= new Incidents(111,"robbery",sdf.parse("2024-09-07"),63.456,-09.897,"robbery in the Vijayawada market ","open",19,5);
			incid.setIncidentID(111);
			incid.setIncidentType("robbery");
			incid.setIncidentDate(sdf.parse("2024-09-07"));
			incid.setLatitude(63.456);
			incid.setLongitude(-09.897);
			incid.setDescription("robbery in vijayawada market");
			incid.setStatus("Open");
			incid.setSuspectID(19);
			incid.setVictimID(5);
			assertEquals(111,incid.getIncidentID() );
			assertEquals("robbery",incid.getIncidentType());
			assertEquals(sdf.parse("2024-09-07"),incid.getIncidentDate());
			assertEquals(63.456,incid.getLatitude(),3);
			assertEquals(-09.897,incid.getLongitude(),3);
		
			assertEquals("robbery in vijayawada market",incid.getDescription());
			assertEquals("Open",incid.getStatus());
			assertEquals(5,incid.getVictimID());
			assertEquals(19,incid.getSuspectID());
		
			
		}
		@Test 
		
			 public void testHashCode() throws ParseException {
			        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			        Incidents incid1 = new Incidents(111, "robbery", sdf.parse("2024-09-07"), 63.456, -09.897, "robbery in the Vijayawada market", "open", 19, 5);
			        Incidents incid2 = new Incidents(111, "robbery", sdf.parse("2024-09-07"), 63.456, -09.897, "robbery in the Vijayawada market", "open", 19, 5);
			        assertEquals(incid1.hashCode(), incid2.hashCode());
			    }
		@Test
		public void testEquals() throws ParseException {
			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		        Incidents incid1 = new Incidents(111, "robbery", sdf.parse("2024-09-07"), 63.456, -09.897, "robbery in the Vijayawada market", "open", 19, 5);
		        Incidents incid2 = new Incidents(111, "robbery", sdf.parse("2024-09-07"), 63.456, -09.897, "robbery in the Vijayawada market", "open", 19, 5);
		        assertEquals(incid1.equals(incid1), incid2.equals(incid2));
		        
			
		}
		@Test
		public void testToString() throws ParseException {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Incidents incid = new Incidents(111, "robbery", sdf.parse("2024-09-07"), 63.456, -09.897, "robbery in the Vijayawada market", "open", 19, 5);
			String result="Incidents [incidentID=111, incidentType=robbery, incidentDate=Sat Sep 07 00:00:00 IST 2024, latitude=63.456, longitude=-9.897, description=robbery in the Vijayawada market, status=open, victimID=19, suspectID=5]";
			assertEquals(incid.toString(), result);
					
			
		}
		
		
		
		

	
}	
	


