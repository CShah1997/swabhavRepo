package com.techlabs.strategy_pattern;

public class SubtractionOperation implements Strategy{
	
	public int doOperations(int a,int b)
	{
		return a-b;
	}

}
