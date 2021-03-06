package com.techlabs.banking_exception_app;

import static org.junit.Assert.*;

import com.techlabs.banking_exception_app.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccountTest {
//
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}

	@Test(expected=MissingValueException.class)
	public void testBankAccountStringLongDouble() {
		BankAccount acc2=new BankAccount(null, 152207, 1520);
		BankAccount acc3=new BankAccount("dev", 152);
		assertEquals("dev", acc3.getName());
	}
//
//	@Test
//	public void testBankAccountStringLong() {
//		fail("Not yet implemented");
//	}
//
	@Test(expected=MissingValueException.class)
	public void testGetName() {
		BankAccount acc4=new BankAccount("", 15220);
		acc4.getName();
	}
//
//	@Test
//	public void testSetName() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetAccountNumber() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetAccountNumber() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetBalance() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetBalance() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeposit() {
//		fail("Not yet implemented");
//	}

	private void assertTrue(String string, String name) {
		// TODO Auto-generated method stub
		
	}

	@Test(expected=InSufficientFundException.class)
	public void testWithdrawal() {
		BankAccount acc=new BankAccount("chirag", 567890432122L, 500);
		acc.withdrawal(50);
	}
	
	@Test(expected=NegativeValueAcception.class)
	public void withdrawAmount()
	{
		BankAccount acc1=new BankAccount("raj", 12347892);
		acc1.withdrawal(-500);
		acc1.deposit(-800);
	}

//	@Test
//	public void testToString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testEqualsObject() {
//		fail("Not yet implemented");
//	}

}
