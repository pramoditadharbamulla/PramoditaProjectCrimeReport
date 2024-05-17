package com.java.Crime.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;


import com.java.Crime.model.Incidents;

public class ToString {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Incidents incid = new Incidents(111, "robbery", sdf.parse("2024-09-07"), 63.456, -09.897, "robbery in the Vijayawada market", "open", 19, 5);
	System.out.println(incid.toString());}

}
