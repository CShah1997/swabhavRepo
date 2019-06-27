package com.techlabs.strategy_pattern;

public class Context {
	
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public int executeOperations(int a,int b)
	{
		return strategy.doOperations(a, b);
	}

}
