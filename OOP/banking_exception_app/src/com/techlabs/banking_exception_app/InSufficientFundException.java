package com.techlabs.banking_exception_app;

public class InSufficientFundException extends RuntimeException{

	String message;
	
	
	

	public InSufficientFundException(BankAccount account) {
		// TODO Auto-generated constructor stub
		message="Deduction failed due to low balance available...in your account named... "+account.getName();
	}

	
	
	public String getBalMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
