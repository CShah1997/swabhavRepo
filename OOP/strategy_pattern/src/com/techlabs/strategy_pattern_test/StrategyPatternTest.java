package com.techlabs.strategy_pattern_test;
import com.techlabs.strategy_pattern.*;

public class StrategyPatternTest {
	
	public static void main(String args[])
	{
		Context context;
		context=new Context(new AdditionOperation());
		System.out.println("Addition="+context.executeOperations(5, 4));
		context=new Context(new SubtractionOperation());
		System.out.println("Subtraction="+context.executeOperations(5, 4));
		
	}

}
