package com.techlabs.exceptions_app;

public class BugTest {
	
	public static void main(String args[])
	{
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound exception...");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception...");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number format exception...");
		}
		catch(Exception e)
		{
			System.out.println("Exception "+e);
		}
	}

}
