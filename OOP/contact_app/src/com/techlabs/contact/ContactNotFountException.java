package com.techlabs.contact;

public class ContactNotFountException extends RuntimeException {
	public ContactNotFountException(String s) {
		super(s);
		System.out.println("Contact Not Found");
	}
}
