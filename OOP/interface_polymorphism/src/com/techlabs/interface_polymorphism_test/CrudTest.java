package com.techlabs.interface_polymorphism_test;

import com.techlabs.interface_polymorphism.DeptDB;
import com.techlabs.interface_polymorphism.EmployeeDB;
import com.techlabs.interface_polymorphism.ICrudable;
import com.techlabs.interface_polymorphism.LocationDB;

public class CrudTest {

	public static void main(String args[])
	{
		ICrudable icrudable;
		icrudable = new EmployeeDB();
		doDBOperations(icrudable);
		
		icrudable = new DeptDB();
		doDBOperations(icrudable);
		
		icrudable = new LocationDB();
		doDBOperations(icrudable);
	}

	private static void doDBOperations(ICrudable icrudable) {
		icrudable.create();
		icrudable.read();
		icrudable.update();
		icrudable.delete();
	}
	
}
