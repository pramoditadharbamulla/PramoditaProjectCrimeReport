package com.java.Crime.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.java.Crime.model.Incidents;

public interface IncidentsDao {
	Boolean CreateIncident(Incidents incident) throws ClassNotFoundException, SQLException;
	List<Incidents> SearchIncidents(String IncidentType) throws ClassNotFoundException, SQLException; 
	Boolean    updateIncidentStatus(String Status,int IncidentID) throws ClassNotFoundException, SQLException; 
    List<Incidents>genrateIncidentReport() throws ClassNotFoundException, SQLException;
    List<Incidents>getIncidentsDateRange(Date startDate,Date endDate) throws ClassNotFoundException, SQLException;
    Incidents  SearchIncidentsByID(int IncidentID) throws ClassNotFoundException, SQLException;
}
