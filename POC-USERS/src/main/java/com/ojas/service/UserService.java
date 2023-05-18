package com.ojas.service;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.ojas.entity.User;
import com.ojas.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	public Optional<User> findUserById(Integer userId) {
		return userRepo.findById(userId);
	}

	public List<User> getAllUsers(){
		return userRepo.findAll();
		
	}

	public void delete(int id) {
		userRepo.deleteById(id);	
	}
	
	public User update(User user) {
		return userRepo.save(user);
	}
	
	}


