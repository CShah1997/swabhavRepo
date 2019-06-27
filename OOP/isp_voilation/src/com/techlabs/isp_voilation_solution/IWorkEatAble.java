package com.techlabs.isp_voilation_solution;

public interface IWorkEatAble extends IWorkable,IEatable{

	public void startWork();
	public void stopWork();
	public void startEat();
	public void stopEat();
	
}
