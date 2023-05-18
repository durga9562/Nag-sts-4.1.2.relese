package com.ojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ojas.one.Noraml;



@SpringBootApplication
public class Javaguid01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Javaguid01Application.class, args);
		Noraml bean = context.getBean(Noraml.class);
		bean.m1();
	
	}

}
