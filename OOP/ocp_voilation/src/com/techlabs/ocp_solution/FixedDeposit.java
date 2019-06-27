package com.techlabs.ocp_solution;

public class FixedDeposit {
	
	private String account_number;
	private String name;
	private double principle;
	private float period;
	private double rate;
	
	
	public FixedDeposit(String account_number, String name, double principle, float period, Festival festival) {
		super();
		this.account_number = account_number;
		this.name = name;
		this.principle = principle;
		this.period = period;
		this.rate = Festival.rate;
	}
	
	public double calculateSimpleInterest()
	{
		return principle * Festival.rate * period / 100;	
	}

}
