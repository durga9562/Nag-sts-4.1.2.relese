package com.ojas.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.user.entity.User;
import com.ojas.user.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public List<User> getAllUsers() {
	
		return userRepository.findAll();
	}
	@Override
	public User registerUser(User user) {
		
		return userRepository.save(user);
	}
	@Override
	public User login(String username, String password) {
		User user = userRepository.findByUsernameAndPassword(username, password);
		return user;
	}

}
