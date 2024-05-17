package com.java.Crime.main;

import java.sql.SQLException;
import java.util.Scanner;
import com.java.Crime.dao.*;

import com.java.Crime.model.Incidents;

public class UpdateIncidentStatusMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    Incidents incident= new Incidents();
	    System.out.println("enter IncidentID");
	    incident.setIncidentID(sc.nextInt());
	    System.out.println("enter status");
	    incident.setStatus(sc.next());
	    IncidentsDao  dao=new IncidentsDaoImpl();
	    try {
			Boolean Success=dao.updateIncidentStatus(incident.getStatus(), incident.getIncidentID());
			if(Success==true) {
				System.out.println("**data updated succesfully**");
			}
			else {
				System.out.println("**data not updated**");
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
