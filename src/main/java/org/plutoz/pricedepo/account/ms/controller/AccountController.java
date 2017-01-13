package org.plutoz.pricedepo.account.ms.controller;

import org.plutoz.pricedepo.account.ms.domain.Account;
import org.plutoz.pricedepo.account.ms.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
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
	Iterable<Account> getList(){
		return accountService.findAll();
	}

}
