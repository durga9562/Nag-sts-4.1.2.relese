package com.ojas.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.user.entity.User;
import com.ojas.user.service.UserServiceImpl;


@RestController
public class UserController {
	@Autowired
	private UserServiceImpl userService;
	@GetMapping("/all")
	private List<User> getAllUser() {
		return userService.getAllUsers();
		
	}
	@PostMapping("/register")
	private User saveUser(@RequestBody User user) {
		User result=user;
if(user.getPassword().equals(user.getConfirmpassword())) {
			
			try {
				
				result= userService.registerUser(user);
				System.out.println("Registation succesfull");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				user= null;
			}
		}
else {
	System.out.println("please enter currect password");
}
		return user;
		
}
	
}
