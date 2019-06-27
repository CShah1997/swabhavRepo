package com.techlabs.isp_voilation;

public class Manager implements IWorker{
	
	public void startWork()
	{
		System.out.println("Manager Start working");
	}
	
	public void stopWork()
	{
		System.out.println("Manager Stop working");
	}
	
	public void startEat()
	{
		System.out.println("Manager Start eating");
	}
	
	public void stopEat()
	{
		System.out.println("Manager Stop eating");
	}

}
