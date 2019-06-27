package com.techlabs.jUnit_demo_test;
import com.techlabs.jUnit_demo.*;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class DemoJunitTest {

	public static void main(String args[])
	{
		
		Result result = JUnitCore.runClasses(DemoJUnit.class);
		
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	}
}
