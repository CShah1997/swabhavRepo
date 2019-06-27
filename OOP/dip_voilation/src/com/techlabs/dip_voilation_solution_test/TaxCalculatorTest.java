package com.techlabs.dip_voilation_solution_test;



import com.techlabs.dip_voilation_solution.DBLogger;
import com.techlabs.dip_voilation_solution.ILogable;
import com.techlabs.dip_voilation_solution.TaxCalulator;

public class TaxCalculatorTest {

	public static void main(String[] args) {

		TaxCalulator tc=new TaxCalulator(new DBLogger());
		int r=tc.calculateTax(0, 0);
		System.out.println(r);
		
		
	}

}
