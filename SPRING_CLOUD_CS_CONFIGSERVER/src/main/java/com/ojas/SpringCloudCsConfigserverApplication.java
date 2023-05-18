package com.ojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudCsConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCsConfigserverApplication.class, args);
	}

}
