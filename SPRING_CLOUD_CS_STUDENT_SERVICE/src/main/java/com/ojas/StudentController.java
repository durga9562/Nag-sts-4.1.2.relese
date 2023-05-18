package com.ojas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stu")
public class StudentController {
	@Value("${title}")
	private String title;
	@GetMapping("/info")
	public String getData() {
		return "Sample====>"+title;
		
	}

}
