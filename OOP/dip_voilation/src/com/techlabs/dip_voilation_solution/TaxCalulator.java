package com.techlabs.dip_voilation_solution;


import com.techlabs.dip_voilation_solution.*;

public class TaxCalulator {
	
	private ILogable log;
	
	public TaxCalulator(ILogable log) {
		super();
		this.log = log;
	}
	
	public int calculateTax(int amount, int rate) {
		int r = 0;
		try {
			r = amount / rate;
		} catch (Exception e) {
			log.log(e.getMessage());
		}
		return r;
	}

}
