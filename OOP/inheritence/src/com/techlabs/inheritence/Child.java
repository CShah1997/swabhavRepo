package com.techlabs.inheritence;
import com.techlabs.inheritence.*;

public class Child extends Parent {
	
	/*public Child()
	{
		System.out.println("Child Created");
	}*/
	
	public Child(int foo)
	{
		super(foo);
		System.out.println("Child Created");
	}
}
