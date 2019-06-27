package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IBalanceChange;

public class EmailNotifiction implements IBalanceChange {

	@Override
	public void balanceChangeNotifier(Account account) {
		System.out.println("Mail sent to " + account.getEmail() + " : " + account.getName()
				+ ", Account balance has chnaged, Updated balance is : " + account.getBalance());
	}

}
