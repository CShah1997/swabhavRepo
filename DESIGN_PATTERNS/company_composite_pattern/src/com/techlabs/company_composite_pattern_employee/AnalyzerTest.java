package com.techlabs.company_composite_pattern_employee;

import java.net.MalformedURLException;

public class AnalyzerTest {
	public static void main(String args[]) throws MalformedURLException {
		//Analyzer analyzer = new Analyzer(new FileDataParser(new UrlLoader("https://swabhav-tech.firebaseapp.com/emp.txt")));
		Analyzer analyzer = new Analyzer(new FileDataParser(new DiskLoader("resource/dataFile")));
		System.out.println("Highest Salaried Employee is : \n" + analyzer.getMaximumSalariedEmployee());
		System.out.println("\nNumber Of Employee Based On Department : \n" + analyzer.getNumberOFEmployeeBasedOnDepartment());
		System.out.println("\nNumber Of Employee Based On Designation : \n" + analyzer.getNumberOfEmployeeBasedOnDesignation());
	}
}
