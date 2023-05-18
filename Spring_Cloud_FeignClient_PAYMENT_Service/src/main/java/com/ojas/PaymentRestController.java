package com.ojas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PaymentRestController {
	@Autowired
private CartRestConsumer consumer;
	@GetMapping("/msg")
	public String getPayMsg() {
		System.out.println("Interface Impl is :"+consumer.getClass().getName());
		return consumer.findMsg();
		}
	@GetMapping("/data")
	public ResponseEntity getCartData(){
		return new ResponseEntity(consumer.getData(),HttpStatus.OK);
	}
	@GetMapping("/ob")
	public String getCartObj() {
		return "FROM-PAY===>"+consumer.getCart("AA");
	}
	@PostMapping("/create")
	public String CreateCart() {
		return "FROM-PAY===>"+consumer.createCart(new Cart(55, "RRR", 111));
		
	}
}
