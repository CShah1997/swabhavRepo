package com.techlabs.isp_voilation_solution_test;

import com.techlabs.isp_voilation_solution.*;
public class WorkerTest {
	
	public static void main(String args[])
	{
		
		atWorkStation(new Robot());
		atWorkStation(new Manager());
		
		atCafeteria(new Manager());
	}

	private static void atCafeteria(IWorkEatAble w) {
		System.out.println("At Cafeteria...");
		w.startEat();
		w.stopEat();
		
	}

	private static void atWorkStation(IWorkable w) {
		System.out.println("At Workstation...");
		w.startWork();
		w.stopWork();
	}


}
