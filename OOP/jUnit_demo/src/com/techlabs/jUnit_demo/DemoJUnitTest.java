package com.techlabs.jUnit_demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoJUnitTest {
	
	protected int value1,value2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddOperation(int value1,int value2) {
		int result = value1+value2;
		assertTrue(result==6);
	}

	
	
	
	
}
