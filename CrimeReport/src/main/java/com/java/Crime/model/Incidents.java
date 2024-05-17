package com.java.Crime.model;

import java.text.SimpleDateFormat;
import java.util .Date;
import java.util.Objects;

import com.google.common.hash.HashCode;

public class Incidents {
	
	     private int incidentID ;
	     private String incidentType ;
	     private Date  incidentDate;
	     private double latitude; 
	     private double longitude ;
	     private String description; 
	     private String status; 
	     private int victimID ; 
	     private int suspectID;
		public int getIncidentID() {
			return incidentID;
		}
		public void setIncidentID(int incidentID) {
			this.incidentID = incidentID;
		}
		public String getIncidentType() {
			return incidentType;
		}
		public void setIncidentType(String incidentType) {
			this.incidentType = incidentType;
		}
		public Date getIncidentDate() {
			return incidentDate;
		}
		public void setIncidentDate(java.util.Date incidentDate) {
			this.incidentDate = incidentDate;
		}
		public double getLatitude() {
			return latitude;
		}
		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}
		public double getLongitude() {
			return longitude;
		}
		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public int getVictimID() {
			return victimID;
		}
		public void setVictimID(int victimID) {
			this.victimID = victimID;
		}
		public int getSuspectID() {
			return suspectID;
		}
		public void setSuspectID(int suspectID) {
			this.suspectID = suspectID;
		}
		@Override
		public String toString() {
			return "Incidents [incidentID=" + incidentID + ", incidentType=" + incidentType + ", incidentDate="
					+ incidentDate + ", latitude=" + latitude + ", longitude=" + longitude + ", description="
					+ description + ", status=" + status + ", victimID=" + victimID + ", suspectID=" + suspectID + "]";
		}
		public Incidents(int incidentID, String incidentType, Date incidentDate, double latitude, double longitude,
				String description, String status, int victimID, int suspectID) {
			super();
			this.incidentID = incidentID;
			this.incidentType = incidentType;
			this.incidentDate = incidentDate;
			this.latitude = latitude;
			this.longitude = longitude;
			this.description = description;
			this.status = status;
			this.victimID = victimID;
			this.suspectID = suspectID;
		}
		public Incidents() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public int hashCode() {
		// TODO Auto-generated method stub
			return Objects.hash(incidentID, incidentType, incidentDate, latitude, longitude, description, status, victimID, suspectID);
		}
		@Override
		public boolean equals(Object obj) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Incidents incidents= (Incidents)obj;
//			System.out.println(sdf.format(dateOfBirth));
//			System.out.println(sdf.format(employee.getDateOfBirth()));
			if (incidents.getIncidentID() == incidentID && incidents.getIncidentType()==incidentType &&
				incidents.getIncidentDate().compareTo(incidentDate)==0 &&incidents.getLatitude()==latitude && incidents.getLongitude()==longitude
					
				&&incidents.getDescription()==description && incidents.getStatus()==status &&incidents.getVictimID()==victimID &&
				incidents.getSuspectID()==suspectID) {
				return true;
			}
			 	
		return false;
	              
		
		}
}
	     
	   
	
		
		


