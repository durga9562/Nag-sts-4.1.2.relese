package com.ojas.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.Product;
import com.ojas.service.ProductServiceImpl;

@RestController
public class ProductController {
	@Autowired
	private ProductServiceImpl productservice;
	@PostMapping("/Addproduct")
	public String addProduct(@RequestBody Product product) {
		productservice.addProduct(product);
		return "Success";
		
	}
	@GetMapping("/prod")
	public List<Product> getAllProducts() {
		return productservice.getAllProduct();
		
	}
	
	@GetMapping("/product/{id}")
	public Optional<Product> getProductById(@PathVariable int id){
		return productservice.getProductById(id);
		
	}
	@DeleteMapping("/product/{id}")
	public String delete(@PathVariable int id) {
		productservice.delete(id);
		return "Successsfully Item Deleted";
	}
	@PutMapping("/product/{id}")
	public String update(@PathVariable Product product) {
		productservice.update(product);
		return "Successfully updated";
		
	}

}
