package com.ojas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/prod")
public class ProductController {
	@Autowired
	private RestTemplate rt;
	@GetMapping("/info")
	public String getInfo() {
		return "Product Info====>"+rt;
		
	}

}
