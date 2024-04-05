package com.cbc.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CreditManagementProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditManagementProjectApplication.class, args);
	}

}
