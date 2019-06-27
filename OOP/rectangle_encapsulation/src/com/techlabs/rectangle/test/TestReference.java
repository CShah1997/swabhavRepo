package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class TestReference {
	
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		r1.setHeight(10);
		r1.setWidth(20);
		printInfo(r1);
		
		
		Rectangle r2=r1;
		printInfo(r2);
		r2.setWidth(100);
		printInfo(r2);
		printInfo(r1);
		System.out.println("Area of rectangle= "+new Rectangle().calcArea());
		
		printInfo(new Rectangle());
	}

	private static void printInfo(Rectangle rect) {
		// TODO Auto-generated method stub
		System.out.println("height= "+rect.getHeight());
		System.out.println("width= "+rect.getWidth());
		System.out.println("area= "+rect.calcArea());
		System.out.println("Hash code is: "+rect.hashCode());
		System.out.println("");
		
	}

}
