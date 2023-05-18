package com.ojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class MicroServiceRegistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceRegistoryApplication.class, args);
	}

}
