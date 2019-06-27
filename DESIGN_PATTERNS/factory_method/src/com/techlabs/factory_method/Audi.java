package com.techlabs.factory_method;

class Audi implements IAutoable{

	@Override
	public void start() {
		System.out.println("Audi starts...");
	}

	@Override
	public void stop() {
		System.out.println("Audi stops...");
	}

}
