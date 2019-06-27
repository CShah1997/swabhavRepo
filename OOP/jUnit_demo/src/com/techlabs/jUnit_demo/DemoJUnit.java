package com.techlabs.jUnit_demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DemoJUnit {
	
	int num1=1;
	
	@Test
	public void addOperation()
	{
		assertTrue(num1>0);
		
	}
	
	
}
