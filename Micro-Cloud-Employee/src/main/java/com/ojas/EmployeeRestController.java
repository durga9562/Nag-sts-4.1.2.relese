package com.ojas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {
	@Autowired
	private AddressRestConsumer consumer;
	@GetMapping("/info")
	public String getDetails() {
		return "From Employee===>"+consumer.callAddressShow();
		
	}

}
