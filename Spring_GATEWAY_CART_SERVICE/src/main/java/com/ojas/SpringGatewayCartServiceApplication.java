package com.ojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringGatewayCartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGatewayCartServiceApplication.class, args);
	}

}
