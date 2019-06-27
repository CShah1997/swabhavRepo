package com.techlabs.interface_polymorphism;

public class DeptDB implements ICrudable{
	
	public void create() {
		System.out.println("Department class creating");
	}

	public void read() {
		System.out.println("Department class reading");
	}

	public void update() {
		System.out.println("Department class updating");
	}

	public void delete() {
		System.out.println("Department class deleting");
	}

}
