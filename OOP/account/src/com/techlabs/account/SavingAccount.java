package com.techlabs.account;

public class SavingAccount extends Account {
	
	private static int MIN_AMT=2000; 
	
	public SavingAccount(String name,int acc_no,float balance)
	{
		super(name, acc_no, balance);
	}
	
	public void withdraw(float withdrawAmount) {
		// TODO Auto-generated method stub
		
		if(balance-withdrawAmount>MIN_AMT)
		{
			balance=balance-withdrawAmount;
		}
			
		
	}

}
