package com.ojas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@GetMapping("/home")
	public String showHome() {
		return "HomePage";

	}
	@GetMapping("/welcome")
	public String showWelcome() {
		return "welcomePage";

	}
	@GetMapping("/admin")
	public String showAdmin() {
		return "adminPage";

	}
	@GetMapping("/employee")
	public String showEmploye() {
		return "employeePage";

	}
	@GetMapping("/student")
	public String showStudent() {
		return "studentPage";
	}
}
