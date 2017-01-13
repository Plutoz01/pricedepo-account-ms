package org.plutoz.pricedepo.account.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PricedepoAccountMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PricedepoAccountMsApplication.class, args);
	}
}
