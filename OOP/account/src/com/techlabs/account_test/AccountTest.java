package com.techlabs.account_test;

import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingAccount;

public class AccountTest {
	
	public static void main(String args[])
	{
		SavingAccount sa=new SavingAccount("ChiragAcc", 152207, 50000);
		CurrentAccount ca=new CurrentAccount("DevAcc", 152208, 25000);
		System.out.println("Saving Account Name= "+sa.getName());
		System.out.println("Saving Account Number= "+sa.getAccNo());
		System.out.println("Saving Account Balance= "+sa.getBalance());
		sa.deposit(2000);
		System.out.println("Final Balance available(after deposit)= "+sa.getBalance());
		sa.withdraw(2000);
		System.out.println("Final Balance available(after withdraw)= "+sa.getBalance());
		
		System.out.println();
		
		System.out.println("Current Account Name= "+ca.getName());
		System.out.println("Current Account Number= "+ca.getAccNo());
		System.out.println("Current Account Balance= "+ca.getBalance());
		//ca.deposit(2000);
		//System.out.println("Final Balance available(after deposit)= "+ca.getBalance());
		ca.withdraw(24700);
		System.out.println("Final Balance available(after withdraw)= "+ca.getBalance());
		
		
	}

}
