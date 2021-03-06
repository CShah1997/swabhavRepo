package com.techlabs.account_test;

import com.techlabs.exceptions.NegativeValueException;
import com.techlabs.exceptions.NullValueException;
import com.techlabs.publisher.Account;
import com.techlabs.subscriber.EmailNotifiction;
import com.techlabs.subscriber.SmsNotification;

public class Test {
	public static void main(String args[]) throws NullValueException, NegativeValueException {
		Account account1 = new Account("Chirag Shah", "1572023123", 10000, "9099776993", "chiragshah@gmail.com");
		
		EmailNotifiction emailNotifier = new EmailNotifiction();
		SmsNotification smsNotifier = new SmsNotification();
		
		account1.registerObserver(smsNotifier);
		account1.registerObserver(emailNotifier);
		
		account1.deposit(1000);
		account1.withdrawal(12000);
	}
}
