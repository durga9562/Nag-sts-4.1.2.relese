package com.ojas.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.ProductEntity;
import com.ojas.service.ProductServiceImpl;

@RestController
public class ProductController {
	@Autowired
	private ProductServiceImpl productservice;
	@PostMapping("/product")
	public ProductEntity addProduct(@RequestBody ProductEntity product) {
		return productservice.addProduct(product);
		
	}
	@GetMapping("/prod")
	public ProductEntity getAllProducts() {
		return productservice.getAllProducts();
		
	}

}
