package com.techlabs.ocp_voilation;

import com.techlabs.ocp_solution.Festival;
import com.techlabs.ocp_solution.HoliFestival;

public class FixedDeposit {

	private String account_number;
	private String name;
	private double principle;
	private float period;
	private FestivalType festival;
	
	private static float HOLI_RATE=(float) 0.08;
	private static float NEW_YEAR_RATE=(float) 0.09;
	private static float NORMAL_RATE=(float) 0.07;
	
	public FixedDeposit(String account_number, String name, double principle, float period, Festival festival) {
		super();
		this.account_number = account_number;
		this.name = name;
		this.principle = principle;
		this.period = period;
		this.festival = festival;
	}
	
	public double calculateSimpleInterest()
	{
		if(festival==FestivalType.HOLI)
		{
			return principle * HOLI_RATE * period / 100;
		}
		else if(festival==FestivalType.NEW_YEAR)
		{
			return principle * NEW_YEAR_RATE * period / 100;
		}
		return principle * NORMAL_RATE * period / 100;
		
	}
}
