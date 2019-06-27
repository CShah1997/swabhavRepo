package com.techlabs.collections_app_test;
import java.util.ArrayList;

import com.techlabs.collections_app.*;

public class TestCollections {
	
	public static void main(String args[])
	{
		ArrayList cart=new ArrayList();
		cart.add(new LineItem(001, "FootBall", 700.95, 3));
		cart.add(new LineItem(002, "Tennis Ball", 50, 8));
		cart.add("Chirag");
		cart.add(90);
		
		for(Object element:cart)
		{
			System.out.println(element);
			
			LineItem objc=(LineItem)element;
			objc.calculateItemCost();
		}

	}

}
