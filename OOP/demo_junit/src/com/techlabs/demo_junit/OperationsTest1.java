package com.techlabs.demo_junit;

import static org.junit.Assert.*;

import com.techlabs.demo_junit.*;

import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OperationsTest1 {

	@Test
	public void testAdd() {
		int result=new Operations().add(1, 2);
		assertTrue(result==3);
		
	}
	
//	@Test(expected = IllegalArgumentException.class)
//	public void testAdd1() {
//		int result=new Operations().add(-1, -2);
//		//assertEquals("Error in number", -3, result);
//		
//	}
		
	@Test(expected = IllegalArgumentException.class)
	public void testAdd1() {
		new Operations().add(-1, -2);
		
	}
	
//	@Rule
//    public ExpectedException thrown=ExpectedException.none();
// 
//    @Test
//    public void throwsExceptionWhenNegativeNumbersAreGiven() {
//        thrown.expect(IllegalArgumentException.class);
//        thrown.expectMessage("Invalid Values");
//        new Operations().add(-1, 3);
//    }
    
    

	@Test
	public void testSub() {
		int result=new Operations().sub(4, 2);
		assertTrue(result==2);
	}

	@Test
	public void testMul() {
		int result=new Operations().mul(1, 2);
		assertTrue(result==2);
	}

	@Test
	public void testDiv() {
		int result=new Operations().div(1, 1);
		assertTrue(result==1);
	}

}
