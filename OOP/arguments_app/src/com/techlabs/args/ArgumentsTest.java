package com.techlabs.args;

public class ArgumentsTest {

	public static void main(String args[])
	{
		System.out.println(args.length);
		
		//System.out.println(args[0]);
		if(args.length<0)
		{
			System.out.println("No args");
		}
		else
		{
			for(String s:args)
			{
				System.out.println("Welcome "+s);
			}
		}
	}
}
