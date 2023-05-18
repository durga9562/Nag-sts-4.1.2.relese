package com.ojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


 
//@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableEurekaClient
//@EnableCircuitBreaker
public class MicroApiGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroApiGateWayApplication.class, args);
	}

}
/*
server.port=9002
spring.application.name=API-GATEWAY


eureka.client.serviceUrl.defaultzone=localhost:8761/

spring.cloud.gateway.discovery.locator.enabled=true
spring.cloud.gateway.routes[0].id=USER-SERVICE
spring.cloud.gateway.routes[0].uri=http://localhost:8082/

spring.cloud.gateway.routes[0].predicates[0]=Path=/user/**
spring.cloud.gateway.routes[1].id=DEPARTMENT-SERVICE
spring.cloud.gateway.routes[1].uri=http://localhost:8083/
spring.cloud.gateway.routes[1].predicates[0]=Path=/department/**

eureka.client.register-with-eureka=true
eureka.client.fetch-registry=true
*/




//server:
//	  port: 9002
//	spring:
//	  application: 
//	    name: API-GATEWAY
//	  cloud:
//	    gateway:
//	      routes:
//	        - id: USER-SERVICE 
//	          uri: lb://USER-SERVICE 
//	          predicates:
//	            - path=/user/**
//	        - id: DEPARTMENT-SERVICE
//	          uri: lb://DEPARTMENT-SERVICE 
//	          predicates:
//	            - path=/department/**
//	eureka:    
//	  client: 
//	    register-with-eureka: true
//	    fetch-registry: true
//	    service-url:
//	      defaultZone: http://localhost:8762/eureka/
//	instance:      
//	  hostname: localhost     
