package org.plutoz.pricedepo.account.ms.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.plutoz.pricedepo.account.ms.domain.Account;
import org.plutoz.pricedepo.account.ms.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = AccountController.class)
public class AccountControllerIntegrationTest {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private AccountService accountService;
	
	@Test
	public void getListTest() throws Exception{
		when(accountService.findAll()).thenReturn(getTestAccounts());
		
		this.mvc.perform(get("/accounts").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.length()", is(2)))
		.andExpect(jsonPath("$[0].id", is(1)))
		.andExpect(jsonPath("$[0].userName", is("test1")));
		
		verify(accountService, times(1)).findAll();
	}
	
	private Iterable<Account> getTestAccounts() {
		List<Account> result = new ArrayList<>();
		
		result.add( new Account(1L, "test1", "testLastName1", "testFirstName1", "test1"));
		result.add( new Account(2L, "test2", "testLastName2", "testFirstName2", "test2"));
		
		return result;
	}
}
