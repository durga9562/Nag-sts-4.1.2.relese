package com.ojas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addr")
public class AddressRestController {
	@Value("${server.port}")
	private String port;
	@GetMapping("/show")
public String showMsg() {
	return "From Address"+port;
	
}
}
