package com.ojas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	@GetMapping("/userServiceFallback")
public String userServiceFallbackMethod() {
	return "user service taking longer then expected please try again";
	
}
	@GetMapping("/departmentServiceFallback")
	public String departmentServiceFallbackMethod() {
		return "department service taking longer then expected please try again";
		
	}
}
