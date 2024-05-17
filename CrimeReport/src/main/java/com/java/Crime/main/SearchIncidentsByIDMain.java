package com.java.Crime.main;

import java.util.Scanner;
import com.java.Crime.Myexceptions.IncidentNumberNotFoundException;
import com.java.Crime.dao.IncidentsDao;
import com.java.Crime.dao.IncidentsDaoImpl;
import com.java.Crime.model.Incidents;

public class SearchIncidentsByIDMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter IncidentID:");
        int incidentID = sc.nextInt();
        sc.nextLine();

        IncidentsDao dao = new IncidentsDaoImpl();
        try {
            Incidents incident = dao.SearchIncidentsByID(incidentID);
            if (incident == null) {
                throw new IncidentNumberNotFoundException("Incident not found with ID: " + incidentID);
            }
            System.out.println(incident);
        } catch (IncidentNumberNotFoundException e) {
            System.err.println("Incident number not found: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
