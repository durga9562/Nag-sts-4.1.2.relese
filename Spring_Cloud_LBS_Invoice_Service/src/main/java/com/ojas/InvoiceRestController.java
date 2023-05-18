package com.ojas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoice")
public class InvoiceRestController {
	@Autowired
	private GSTRestConsumer consumer;
	@GetMapping("/info")
public String showInfo() {
	return "FROM-INVOICE===>"+consumer.GetDetailsFromGST();
	
}
}
