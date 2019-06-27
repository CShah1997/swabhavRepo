package com.techlabs.isp_voilation;

public class Robot implements IWorker{

	public void startWork()
	{
		System.out.println("Robot Start working");
	}
	
	public void stopWork()
	{
		System.out.println("Robot Stop working");
	}
	
	public void startEat()
	{
		throw new RuntimeException();
	}
	
	public void stopEat()
	{
		throw new RuntimeException();
	}
}
