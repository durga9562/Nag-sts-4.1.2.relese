package com.ojas.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ojas.user.entity.User;


@Service
public interface UserService {
	public List<User> getAllUsers();
	public User registerUser(User user);
	public User login(String username,String password);
}
