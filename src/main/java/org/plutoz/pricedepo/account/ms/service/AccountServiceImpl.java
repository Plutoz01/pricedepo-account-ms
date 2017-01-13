package org.plutoz.pricedepo.account.ms.service;

import org.plutoz.pricedepo.account.ms.domain.Account;
import org.plutoz.pricedepo.account.ms.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

	private AccountRepository accountRepository;
	
	@Autowired
	public AccountServiceImpl(AccountRepository accountRepository){
		this.accountRepository = accountRepository;
	}
	
	@Override
	public Iterable<Account> findAll() {
		return accountRepository.findAll();
	}

}
