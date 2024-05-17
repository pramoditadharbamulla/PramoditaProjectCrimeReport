package com.java.Crime.model;

import java.util.Objects;

public class Evidence {
	private int EvidenceID ;
	   private String Description; 
	    private String LocationFound; 
	   private int IncidentID ;
	public int getEvidenceID() {
		return EvidenceID;
	}
	public void setEvidenceID(int evidenceID) {
		EvidenceID = evidenceID;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getLocationFound() {
		return LocationFound;
	}
	public void setLocationFound(String locationFound) {
		LocationFound = locationFound;
	}
	public int getIncidentID() {
		return IncidentID;
	}
	public void setIncidentID(int incidentID) {
		IncidentID = incidentID;
	}
	@Override
	public String toString() {
		return "Evidence [EvidenceID=" + EvidenceID + ", Description=" + Description + ", LocationFound="
				+ LocationFound + ", IncidentID=" + IncidentID + "]";
	}
	public Evidence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evidence(int evidenceID, String description, String locationFound, int incidentID) {
		super();
		EvidenceID = evidenceID;
		Description = description;
		LocationFound = locationFound;
		IncidentID = incidentID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Description, EvidenceID, IncidentID, LocationFound);
	}
	@Override
	public boolean equals(Object obj) {
		
		Evidence other = (Evidence) obj;
		if(Objects.equals(Description, other.Description) && EvidenceID == other.EvidenceID
				&& IncidentID == other.IncidentID && Objects.equals(LocationFound, other.LocationFound)) {
			return true;
		}
		return false;
	}
	
	   

}
