package com.techlab.overload;

public class OverloadingTest {
	
	public static void main(String args[])
	{
		System.out.println("Chirag");
		String str="Shah";
		System.out.println(str);
	
		char c[]={'C','S','h','a','h'};
		System.out.println(c);
		int a=10;
		float b=5;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(true);
		
		OverloadingTest.printInfo();
		OverloadingTest.printInfo(10);
		OverloadingTest.printInfo('x',10);
		
		OverloadingTest.printInfo1();
		
		
	}
	
	public static void printInfo()
	{
		System.out.println("No param");
	}
	public static void printInfo(int a)
	{
		System.out.println("1 param with value "+a);
	}
	
	public static void printInfo(char c,int a)
	{
		System.out.println(c+" and " +a);
	}
	
	private static void printInfo1()
	{
		System.out.print("Welcome Chirag");
	}

}
