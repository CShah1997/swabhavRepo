package com.techlabs.rectangle.test;

import com.techlabs.rectangle.*;

public class RectangleTest {

	public static void main(String args[]) {
		Rectangle big=new Rectangle();
		big.setHeight(10);
		big.setWidth(50);
		big.setColor("Blue");
		
		
		System.out.println("Height= "+big.getHeight());
		System.out.println("Width= "+big.getWidth());
		System.out.println("Color= "+big.getColor());
		System.out.println();
		System.out.println(big.calcArea());
	
	}

}


