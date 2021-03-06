package com.techlabs.lsp_voilation_test;

import com.techlabs.lsp_voilation.Rectangle;
import com.techlabs.lsp_voilation.Square;

public class RectangleTest {
	
	public static void main(String args[])
	{
		hightShouldNotChangeEvenIfWidthIsChanged(new Rectangle(50, 100));
		hightShouldNotChangeEvenIfWidthIsChanged(new Square(50));
		
	}
	
	public static void hightShouldNotChangeEvenIfWidthIsChanged(Rectangle r)
	{
		int beforeChange=r.getHeight();
		r.setWidth(r.getWidth()+5);
		int afterChange=r.getHeight();
		System.out.println(beforeChange);
		System.out.println(afterChange);
		if(beforeChange==afterChange)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
