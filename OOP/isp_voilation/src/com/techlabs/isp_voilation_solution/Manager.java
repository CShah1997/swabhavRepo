package com.techlabs.isp_voilation_solution;

public class Manager implements IWorkEatAble{

	public void startWork()
	{
		System.out.println("Manager starts working");
	}
	
	public void stopWork()
	{
		System.out.println("Manager stops working");
	}
	
	public void startEat()
	{
		System.out.println("Manager starts eating");
	}
	
	public void stopEat()
	{
		System.out.println("Manager stops eating");
	}
	
}
