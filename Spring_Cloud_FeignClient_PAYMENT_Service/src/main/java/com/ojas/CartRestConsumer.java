package com.ojas;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("CART-SERVICE")//service id of producer
public interface CartRestConsumer {
	//url should match 
	@GetMapping("/cart/msg")
	public String findMsg();
	@GetMapping("/cart/data")
	public ResponseEntity<String> getData();
	@GetMapping("/cart/ob/{code}")
	public Cart getCart(@PathVariable String code);
	@PostMapping("/cart/insert")
	public ResponseEntity<String> createCart(@RequestBody Cart cart);
}
