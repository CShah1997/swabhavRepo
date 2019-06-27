package com.techlabs.employee;

public class Developer extends Employee {

	private float PASalary, BonusSalary, AnnualSalary;

	public Developer(String name, int empNo, float salary) {
		super(name, empNo, salary);
	}

	public float getPASalary() {
		PASalary = basicSalary + (float) (0.4 * basicSalary);
		return PASalary;
	}

	public float getBonousSalary() {
		BonusSalary = basicSalary + (float) (0.3 * basicSalary);
		return BonusSalary;
	}

	@Override
	public float getAnnualSalary() {
		AnnualSalary = basicSalary + PASalary + BonusSalary;
		return (float) AnnualSalary;
	}

}
