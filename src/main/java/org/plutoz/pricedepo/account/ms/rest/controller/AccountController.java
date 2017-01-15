package org.plutoz.pricedepo.account.ms.rest.controller;

import org.plutoz.pricedepo.account.ms.domain.Account;
import org.plutoz.pricedepo.account.ms.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	private AccountService accountService;
	
	@Autowired
	public AccountController(AccountService accountService){
		this.accountService = accountService;
	}

	@GetMapping
	Page<Account> getList(Pageable pageable){
		return accountService.findAll(pageable);
	}

}
