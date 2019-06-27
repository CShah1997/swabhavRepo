package com.techlabs.employee;

public abstract class Employee {

	protected String name;
	protected int empNo;
	protected float basicSalary;

	public Employee(String name, int empNo, float salary) {

		this.name = name;
		this.empNo = empNo;
		this.basicSalary = salary;
	}

	public String getName() {
		return name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public abstract float getAnnualSalary();

}
