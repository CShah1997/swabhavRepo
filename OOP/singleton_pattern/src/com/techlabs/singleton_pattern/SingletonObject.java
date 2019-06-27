package com.techlabs.singleton_pattern;

public class SingletonObject {

	//For creating only one object...
	private static SingletonObject instance = new SingletonObject();

	//Constructor private to stop getting initiated...
	private SingletonObject() {

	}

	public static SingletonObject getInstance() {
		return instance;
	}

	public void display() {
		System.out.println("Welcome Chirag...");
	}

}
