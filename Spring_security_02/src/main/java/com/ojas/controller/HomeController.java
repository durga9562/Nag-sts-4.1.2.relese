package com.ojas.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.entity.User;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.model.UserModel;
import com.ojas.repository.UserRepository;


@RestController
public class HomeController {
    @GetMapping("/home")
	public String home() {
		return "you are on the home page...";	
	}
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	
	
	@PostMapping("/register ")
	public User  register(@RequestBody UserModel userModel) {
		 User newUser=new User();
		 newUser.setEmail(userModel.getEmail());
		 newUser.setPassword(passwordEncoder.encode(userModel.getPassword()));

		return userRepository.save(newUser);
		
	}
    @GetMapping("/dashboard")
    public String dashboard() {
		return "This is dashboard context";
    	
    }
	public PasswordEncoder getPasswordEncoder() {
		return passwordEncoder;
	}
	public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}
}
