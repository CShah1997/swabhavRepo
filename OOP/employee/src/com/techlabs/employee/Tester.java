package com.techlabs.employee;

public class Tester extends Employee{
	
	private float perksSalary, annualSalary;

	public Tester(String name, int empNo, float salary) {
		super(name, empNo, salary);
	}
	
	public float getPerksSlary()
	{
		perksSalary=basicSalary+(float) (0.3*basicSalary);
		return perksSalary;
	}
	
	@Override
	public float getAnnualSalary() {
		annualSalary=basicSalary+perksSalary;
		return (float) annualSalary;
	}

}
