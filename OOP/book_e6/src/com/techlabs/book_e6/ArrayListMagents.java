package com.techlabs.book_e6;

import java.util.*;

public class ArrayListMagents {
	
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add(0,"zero");
		a.add(1,"one");
		a.add(2,"two");
		a.add(3,"three");
		printAL(a);
		
		if(a.contains("three"))
		{
			a.add("four");
		}
		a.remove(2);
		printAL(a);
		if(a.indexOf("four")!=4)
		{
			a.add(4,"4.2");
		}
		printAL(a);
		if(a.contains("two"))
		{
			a.add("2.2");
		}
		printAL(a);
		
		
	}

	private static void printAL(ArrayList<String> al) {
		// TODO Auto-generated method stub
		
		for(String element:al)
		{
			System.out.println(element+ " ");
			
		}
		System.out.println("");
	}

}
