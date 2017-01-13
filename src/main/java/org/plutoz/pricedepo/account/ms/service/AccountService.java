package org.plutoz.pricedepo.account.ms.service;

import org.plutoz.pricedepo.account.ms.domain.Account;

public interface AccountService {
	public Iterable<Account> findAll();
}
