package org.plutoz.pricedepo.account.ms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.plutoz.pricedepo.account.ms.repository.AccountRepository;
import org.plutoz.pricedepo.account.ms.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ContextTest {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private AccountService accountService;
	
	@Value("${test.property}")
	String testProperty;
	
	@Test
	public void contextLoads() {
		assertNotNull("AccountRepository can not be null", accountRepository);
		assertNotNull("AccountService can not be null.", accountService);
		assertEquals("test", testProperty);
	}

}
