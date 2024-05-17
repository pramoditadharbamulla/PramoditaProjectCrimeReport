package com.java.Crime.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.java.Crime.dao.ReportsDao;
import com.java.Crime.dao.ReportsDaoImpl;
import com.java.Crime.model.Reports;

public class ShowReportByReportingOfficer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ReportingOfficer");
		
		int ReportingOfficer=sc.nextInt();
		ReportsDao dao=new ReportsDaoImpl();
		try {
			
			List<Reports> reportList=dao.ShowReportsByReportingOfficer(ReportingOfficer);
			if(reportList.isEmpty()) {
				System.out.println("ReportingOfficer Not Found");
			}
			else {
				for (Reports reports : reportList) {
					System.out.println(reports);
					
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
