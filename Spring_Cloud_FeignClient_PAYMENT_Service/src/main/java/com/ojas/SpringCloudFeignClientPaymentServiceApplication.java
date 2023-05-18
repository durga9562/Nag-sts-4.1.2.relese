package com.ojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringCloudFeignClientPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignClientPaymentServiceApplication.class, args);
	}

}
