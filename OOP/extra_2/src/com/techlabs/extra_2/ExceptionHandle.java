package com.techlabs.extra_2;

class Chirag extends Exception{}

public class ExceptionHandle{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Welcome");
			doTest();
		}
		catch(Chirag e)
		{
			System.out.println("Chirag");
		}
		finally{
			System.out.println("Final");
		}
	}

	private static void doTest() throws Chirag {
		// TODO Auto-generated method stub
		throw new Chirag();
	}
}