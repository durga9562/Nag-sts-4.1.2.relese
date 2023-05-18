package com.ojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PocUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocUsersApplication.class, args);
	}

}
