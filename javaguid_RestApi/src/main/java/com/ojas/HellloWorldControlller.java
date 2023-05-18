package com.ojas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloWorldControlller {
	@GetMapping("/hello")
public String Hello() {
	return "java";
	
}
}
