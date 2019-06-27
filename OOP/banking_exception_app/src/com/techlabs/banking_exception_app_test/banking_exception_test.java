package com.techlabs.banking_exception_app_test;
import com.techlabs.banking_exception_app.*;
public class banking_exception_test {

		public static void main(String args[]) {

			BankAccount account = new BankAccount("chirag", 567890432122L);
			System.out.println("Current balance "+account.getBalance());
			account.deposit(50000);
			System.out.println("Current balance after deposit... "+account.getBalance());
			try{
				account.withdrawal(100);
				System.out.println("Current balance after withdrawal... "+account.getBalance());
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}


}
