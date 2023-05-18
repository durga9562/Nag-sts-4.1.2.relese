package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.Product;
import com.ojas.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productrepo;

	@Override
	public Product addProduct(Product product) {

		return productrepo.save(product);
	}


	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productrepo.findAll();
	}


	@Override
	public Optional<Product> getProductById(int id) {
		
		return productrepo.findById(id);
	}


	@Override
	public void delete(int id) {
		productrepo.deleteById(id);
		
	}


	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return productrepo.save(product);
	}

}
