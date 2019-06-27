package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IBalanceChange;

public class SmsNotification implements IBalanceChange {

	@Override
	public void balanceChangeNotifier(Account account) {
		System.out.println("SMS sent to " + account.getPhone() + " : " + account.getName()
				+ ", Account balance has changed, Updated balance is : " + account.getBalance());
	}

}