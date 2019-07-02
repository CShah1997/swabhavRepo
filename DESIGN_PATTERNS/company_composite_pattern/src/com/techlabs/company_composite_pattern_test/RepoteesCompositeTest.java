package com.techlabs.company_composite_pattern_test;



import java.util.HashSet;
import java.util.Iterator;

import com.techlabs.company_composite_pattern_employee.DiskLoader;
import com.techlabs.company_composite_pattern_employee.Employee;
import com.techlabs.company_composite_pattern_employee.FileDataParser;

public class RepoteesCompositeTest {
	
	public static void main(String args[]) {
		FileDataParser parser = new FileDataParser(new DiskLoader("resource/dataFile"));
		Employee employee = new Employee();
		HashSet<Employee> employeeList = employee.getEmployeeList();

		for (Iterator<Employee> iterator = employeeList.iterator(); iterator.hasNext();) {
			Employee e = (Employee) iterator.next();
			e.addRepotees();
		}
		

		for (Iterator<Employee> iterator = employeeList.iterator(); iterator.hasNext();) {
			Employee e = (Employee) iterator.next();
			if (e.getName().equals("KING")) {
				e.displayRepoteeHierarchy();
			}
		}
	}
}
