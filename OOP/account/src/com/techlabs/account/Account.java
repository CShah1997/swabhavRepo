package com.techlabs.account;

public abstract class Account {
	
	protected int acc_no;
	protected String name;
	protected float balance;
		
	public Account(String name,int acc_no,float balance)
	{
		this.name=name;
		this.acc_no=acc_no;
		this.balance=balance;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAccNo()
	{
		return acc_no;
	}
	
	public float getBalance()
	{
		return balance;
	}
	
	public void deposit(float depositAmount)
	{
		balance=balance+depositAmount;
		
	}
	
	public abstract void withdraw(float withdrawAmount);
	
	
	

}
