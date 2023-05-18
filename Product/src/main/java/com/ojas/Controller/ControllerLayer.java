package com.ojas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.Customer;
import com.ojas.entity.Order;
import com.ojas.entity.Product;
import com.ojas.service.ServiceLayer;

@RestController
public class ControllerLayer {

	@Autowired
	private ServiceLayer service;

//  Product Details

	@PostMapping("/addOnePro")
	public Product addOneProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}

	@GetMapping("/oneProduct")
	public Product getOneProductById(@PathVariable int id) {
		return service.getByProductId(id);
	}

	@GetMapping("/allPros")
	public List<Product> getAllProductDetails() {
		return service.getAllProducts();
	}

//  Order Details

	@PostMapping("/addOneOrd")
	public Order placeOrder(@RequestBody Order order) {
		return service.addOrder(order);
	}

	@GetMapping("/oneOrder")
	public Order getOneOrderById(@PathVariable int id) {
		return service.getByOrderId(id);
	}

	@GetMapping("/allOrders")
	public List<Order> getAllOrdersDetails() {
		return service.getAllOrders();
	}

//  Customer Details

	@PostMapping("/addOneCust")
	public Customer addOneCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}

	@GetMapping("/oneOrder")
	public Customer getOneCustomerById(@PathVariable int id) {
		return service.getByCustomerId(id);
	}

	@GetMapping("/allOrder")
	public List<Customer> getAllCustomersDetails() {
		return service.getAllCustomers();
	}

}
