package com.java.Crime.main;
import java.sql.SQLException;

import java.util.List;

import com.java.Crime.dao.ReportsDao;
import com.java.Crime.dao.ReportsDaoImpl;
import com.java.Crime.model.Reports;

public class ShowReportsMain {
	public static void main(String[] args) {
		ReportsDao dao=new ReportsDaoImpl();
		
		
		
		try {
			List<Reports> reportList = dao.ShowReports();
			 for (Reports reports : reportList) 
				 System.out.println(reports);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
		
		
	}


