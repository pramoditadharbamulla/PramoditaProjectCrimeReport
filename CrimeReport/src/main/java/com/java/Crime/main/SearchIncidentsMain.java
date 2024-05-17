package com.java.Crime.main;
import com.java.Crime.dao.*;
import com.java.Crime.model.Incidents;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class SearchIncidentsMain {
	public static void main(String[] args) {
		String IncidentType;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter incidentType");
		IncidentType=sc.next();
		IncidentsDao dao=new IncidentsDaoImpl();
		try {
			List<Incidents>incidentList=dao.SearchIncidents(IncidentType);
			if(incidentList.isEmpty()) {
				System.out.println("not valid IncidentType");
			}
			else {
			for (Incidents incidents : incidentList) {
				System.out.println(incidents);
				
			}
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		
	}

}
