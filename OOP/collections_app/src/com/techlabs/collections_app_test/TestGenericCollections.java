package com.techlabs.collections_app_test;

import java.util.ArrayList;

import com.techlabs.collections_app.LineItem;

public class TestGenericCollections {
	
	public static void main(String args[])
	{
		ArrayList<LineItem> cart=new ArrayList<LineItem>();
		cart.add(new LineItem(001, "FootBall", 7, 3));
		cart.add(new LineItem(002, "Tennis Ball", 5, 8));
				
		for(LineItem element:cart)
		{
			System.out.println(element.getProductName());
			System.out.println(element.calculateItemCost());
		}
	}


}
