package com.techlabs.demo_junit;

public class Operations {
	
	
	
	public int add(int num1,int num2)
	{
		if(num1<0 || num2<0)
		{
			throw new IllegalArgumentException("Invalid Values");
		}
		return num1+num2;
	}
	
	public int sub(int num1,int num2)
	{
		return num1-num2;
	}
	
	public int mul(int num1,int num2)
	{
		return num1*num2;
	}
	
	public int div(int num1,int num2)
	{
		return num1/num2;
	}

}
