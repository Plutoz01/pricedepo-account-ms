package org.plutoz.pricedepo.account.ms.service;

import javax.transaction.Transactional;

import org.plutoz.pricedepo.account.ms.domain.Account;
import org.plutoz.pricedepo.account.ms.repository.AccountRepository;
import org.plutoz.pricedepo.common.service.AbstractCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AccountServiceImpl extends AbstractCrudService<Account, Long> implements AccountService {
	
	@Autowired
	public AccountServiceImpl(AccountRepository accountRepository){
		super(accountRepository);
	}
}
