package com.techlabs.dip_voilation_test;

import com.techlabs.dip_voilation.LogType;
import com.techlabs.dip_voilation.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		TaxCalculator calculate=new TaxCalculator(LogType.FILE);
		int r=calculate.calculateTax(0, 0);
		System.out.println(r);
	}

}
