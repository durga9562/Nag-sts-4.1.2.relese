package com.ojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.ProductEntity;
import com.ojas.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productrepo;

	@Override
	public ProductEntity addProduct(ProductEntity product) {
		
		return productrepo.save(product);
	}

	@Override
	public ProductEntity getAllProducts() {
	
		return (ProductEntity) productrepo.findAll();
	}

}
