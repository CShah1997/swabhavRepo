package com.techlabs.rectangle.test;

import com.techlabs.rectangle.*;

public class RectangleTest {

	public static void main(String args[]) {
		Rectangle big=new Rectangle();
		big.height=-15;
		big.width=10;
		System.out.println("Height= "+big.height+" Width= "+big.width);
		if(big.height<0 || big.width<0)
		{
			big.height=Math.abs(big.height);
			big.width=Math.abs(big.width);
		}
		
		System.out.println(big.calculateArea());

		
		Rectangle small=new Rectangle();
		small.height=5;
		small.width=3;
		System.out.println("Height= "+small.height+" Width= "+small.width);
		System.out.println(small.calculateArea());
		
		
		
	
	}

}
