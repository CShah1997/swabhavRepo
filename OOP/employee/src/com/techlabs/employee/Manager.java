package com.techlabs.employee;

public class Manager extends Employee {

	private float HRASalary, TASalary, DASalary, AnnualSalary;

	public Manager(String name, int empNo, float salary) {
		super(name, empNo, salary);
	}

	public float getHRASalary() {
		HRASalary = basicSalary + (float) (0.5 * basicSalary);
		return HRASalary;
	}

	public float getTASalary() {
		TASalary = basicSalary + (float) (0.4 * basicSalary);
		return TASalary;
	}

	public float getDASalary() {
		DASalary = basicSalary + (float) (0.3 * basicSalary);
		return DASalary;
	}

	@Override
	public float getAnnualSalary() {
		AnnualSalary = basicSalary + HRASalary + TASalary + DASalary;
		return (float) AnnualSalary;
	}

}
