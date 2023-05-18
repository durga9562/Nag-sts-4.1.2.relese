package com.ojas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ojas.entity.ProductEntity;
@Service
public interface ProductService {
ProductEntity addProduct(ProductEntity product);

//ProductEntity getEmpById(int pid);
ProductEntity getAllProducts();

}
