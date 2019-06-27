package com.techlabs.interface_polymorphism;

public class LocationDB implements ICrudable{
	
	public void create() {
		System.out.println("Location class creating");
	}

	public void read() {
		System.out.println("Location class reading");
	}

	public void update() {
		System.out.println("Location class updating");
	}

	public void delete() {
		System.out.println("Location class deleting");
	}

}
