package com.techlabs.interface_polymorphism;


public class EmployeeDB implements ICrudable{
	
	public void create() {
		System.out.println("Employee class creating");
	}

	public void read() {
		System.out.println("Employee class reading");
	}

	public void update() {
		System.out.println("Employee class updating");
	}

	public void delete() {
		System.out.println("Employee class deleting");
	}
	
	

}
