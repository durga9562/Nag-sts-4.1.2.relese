package com.ojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.Customer;
import com.ojas.entity.Order;
import com.ojas.entity.Product;
import com.ojas.repository.CustomerRepo;
import com.ojas.repository.OrderRepo;
import com.ojas.repository.ProductRepo;

@Service
public class ServiceLayer {

	@Autowired
	private CustomerRepo custRepo;

	@Autowired
	private ProductRepo proRepo;

	@Autowired
	private OrderRepo ordRepo;

//  Product Details
	public Product addProduct(Product product) {
		return proRepo.save(product);
	}

	public Product getByProductId(int id) {
		return proRepo.findById(id).get();
	}

	public List<Product> getAllProducts() {
		return proRepo.findAll();
	}

//  Order Details
	public Order addOrder(Order order) {
		return ordRepo.save(order);
	}

	public Order getByOrderId(int id) {
		return ordRepo.findById(id).get();
	}

	public List<Order> getAllOrders() {
		return ordRepo.findAll();
	}

//  Customer Details
	public Customer addCustomer(Customer customer) {
		return custRepo.save(customer);
	}

	public Customer getByCustomerId(int id) {
		return custRepo.findById(id).get();
	}

	public List<Customer> getAllCustomers() {
		return custRepo.findAll();
	}

}
