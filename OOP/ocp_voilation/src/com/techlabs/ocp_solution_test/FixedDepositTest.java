package com.techlabs.ocp_solution_test;

import com.techlabs.ocp_solution.Festival;
import com.techlabs.ocp_solution.HoliFestival;
import com.techlabs.ocp_solution.NewYearFestival;
import com.techlabs.ocp_voilation.FestivalType;
import com.techlabs.ocp_voilation.FixedDeposit;

public class FixedDepositTest {
	
	public static void main(String args[])
	{
		FixedDeposit fd1=new FixedDeposit("001", "Dev", 10000.00, 4.0f, new HoliFestival());
		System.out.println(fd1.calculateSimpleInterest());
		FixedDeposit fd2=new FixedDeposit("002", "Dev", 10000.00, 4.0f, new NewYearFestival());
		System.out.println(fd2.calculateSimpleInterest());
		
	}

}
