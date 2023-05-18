package com.ojas.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.VO.ResponseTemplateVO;
import com.ojas.entity.User;
import com.ojas.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
//@Slf4j
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
	//	log.info("inside saveUser method of UserController");

		return userService.saveUser(user);
	}

	@GetMapping("/{id}")
	public User findUserById(@PathVariable("id") Integer userId) {
	//	log.info("inside findUserById method of UserController");

		return userService.findUserById(userId);
	}

	@GetMapping("/res/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Integer userId) {
	//	log.info("inside getUserWithDepartment method of UserController");
		return userService.getUserWithDepartment(userId);

	}
}
