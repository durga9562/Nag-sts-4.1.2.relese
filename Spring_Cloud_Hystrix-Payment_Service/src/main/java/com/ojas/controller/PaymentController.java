package com.ojas.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	//actual service method
	@GetMapping("/pay")
	@HystrixCommand(fallbackMethod="doDummyPayment")
public String doPayment() {
		//actual service 
		//we write logic in this method
		//if this method throw any exception go to the fal back method or dummy method
		System.out.println("From Actual Service");
		if(new Random().nextInt(15)<10) {
			throw new RuntimeException("DUMMY EXCEPTION");
		}
	return "Done";
	
}
	//fallback method
	public String doDummyPayment() {
		//if above method giving exception directly come to this dummy mrthod
		System.out.println("FROM FALL-BACK METHOD");
		return "Try Later";
		
	}
}
