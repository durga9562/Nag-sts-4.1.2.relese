package com.ojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudFeignClientCartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignClientCartServiceApplication.class, args);
	}

}
