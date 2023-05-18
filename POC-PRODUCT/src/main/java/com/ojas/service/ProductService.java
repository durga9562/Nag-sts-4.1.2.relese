package com.ojas.service;

import java.util.List;
import java.util.Optional;
import com.ojas.entity.Product;

public interface ProductService {
Product addProduct(Product product);
public List<Product> getAllProduct();

public Optional<Product> getProductById(int id);
public void delete(int id);
public Product update(Product product);

}
