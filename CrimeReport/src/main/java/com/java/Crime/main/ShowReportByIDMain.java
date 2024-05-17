package com.java.Crime.main;

import java.sql.SQLException;
import java.util.Scanner;
import com.java.Crime.dao.*;
import com.java.Crime.model.Reports;


public class ShowReportByIDMain {
	public static void main(String[] args) {
		
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter ReportID");
	
	int ReportID=sc.nextInt();
	ReportsDao dao=new ReportsDaoImpl();
	try {
		
		Reports report=dao.ShowRePortsByID(ReportID);
		if(report==null) {
			System.out.println("invalid ReportID");
		}
		else {
			System.out.println(report);
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
