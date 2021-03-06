package com.techlabs.banking_exception_app;

public class BankAccount {
	
		private String name;
		private long accountNumber;
		private double balance;
		private static double MIN_BALANCE = 500.00;

		public BankAccount(String name, long accountNumber, double balance) {
			if(name==null)
				throw new MissingValueException();
			this.name = name;
			this.accountNumber = accountNumber;
			this.balance = balance;
		}

		public BankAccount(String name, long accountNumber) {
			this(name, accountNumber, MIN_BALANCE);				
		}

		public String getName() {
			if(name=="")
				throw new MissingValueException();
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(long balance) {
			this.balance = balance;
		}

		public void deposit(double amount) {
			if(amount<0)
				throw new NegativeValueAcception();
			this.balance += amount;
		}

		public void withdrawal(double amount) {
			if (!this.checkTransactionIsSafe(amount))
				throw new InSufficientFundException(this);
			if(amount<0)
				throw new NegativeValueAcception();
			this.balance -= amount;
		}

		private boolean checkTransactionIsSafe(double amount) {
			if (amount > this.balance)
				return false;
			if ((this.balance - amount) < MIN_BALANCE)
				return false;
			return true;
		}

		@Override
		public String toString() {
			String s="Name : " + this.getName() + "\n" + "Account number : " + this.getAccountNumber() + "\n" + "Balance : "
					+ this.getBalance()+"\n"+super.toString();
			return s;
		}

		@Override
		public boolean equals(Object o) {
			BankAccount acc = (BankAccount) o;
			return this.accountNumber == acc.accountNumber && this.name == acc.name && this.balance == acc.balance;
		}
	


}
