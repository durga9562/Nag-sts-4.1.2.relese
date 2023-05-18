package com.ojas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ojas.entity.User;
import com.ojas.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	
	@PostMapping("/add")
	public String addUser(@RequestBody User user) {
		userService.saveUser(user);
		return "SuccessFully User Registered";	
	}
		@GetMapping("/allUsers")
		private List<User> getAllUsers(){
			return userService.getAllUsers();
			
			
		}
		
		@GetMapping("/user/{id}")
		public Optional<User> getUserById(@PathVariable int id){
			return userService.findUserById(id);
			
		}
		@DeleteMapping("/user/{id}")
		public String delete(@PathVariable int id) {
			userService.delete(id);
			return "Successfully User Deleted";
		}
		@PutMapping("/user/{id}")
		public String update(@PathVariable User user) {
			userService.update(user);
			return "SuccessFully User Details updated";
			
		}

	
	
}
