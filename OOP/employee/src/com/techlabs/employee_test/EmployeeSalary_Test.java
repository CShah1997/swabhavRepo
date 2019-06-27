package com.techlabs.employee_test;
import java.io.BufferedWriter;
import java.io.FileWriter;

import com.techlabs.employee.*;

public class EmployeeSalary_Test {
	
	public static void main(String args[])
	{
		
		Manager manager=new Manager("Chirag", 18, 10000);
		System.out.println("Employee Name= "+manager.getName());
		System.out.println("HRA Salary= "+manager.getHRASalary());
		System.out.println("TA Salary= "+manager.getTASalary());
		System.out.println("DA Salary= "+manager.getDASalary());
		System.out.println("Manager Annual Salary="+manager.getAnnualSalary());
		System.out.println();
		
		Developer developer=new Developer("Dev", 16, 5000);
		System.out.println("Employee Name= "+developer.getName());
		System.out.println("PA Salary= "+developer.getPASalary());
		System.out.println("Bonus Salary= "+developer.getBonousSalary());
		System.out.println("Developer Annual Salary="+developer.getAnnualSalary());
		System.out.println();
		
		Tester tester=new Tester("Raj", 17, 50000);
		System.out.println("Employee Name= "+tester.getName());
		System.out.println("Perk Salary= "+tester.getPerksSlary());
		System.out.println("Tester Annual Salary= "+tester.getAnnualSalary());
		System.out.println();
			
		
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Manager.html"));
			bw.write("<html><head><title>Manager</title></head><body><table border=1>");
			bw.write("<tr><td colspan=2>MANAGER</td></tr>");
			bw.write("<tr><td>Name</td><td>"+manager.getName()+"</td></tr>");
			bw.write("<tr><td>EmpNo</td><td>"+manager.getEmpNo()+"</td></tr>");
			bw.write("<tr><td>HRA Salary</td><td>"+manager.getHRASalary()+"</td></tr>");
			bw.write("<tr><td>TA Salary</td><td>"+manager.getTASalary()+"</td></tr>");
			bw.write("<tr><td>DA Salary</td><td>"+manager.getDASalary()+"</td></tr>");
			bw.write("</table</body></html>");
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
