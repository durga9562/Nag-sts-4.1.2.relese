package com.ojas.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ojas.model.User;
import com.ojas.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService,UserDetailsService {
	@Autowired
	private UserRepository repo;

	@Override
	public Integer saveUser(User user) {
		user = repo.save(user);
		System.out.println(user);
		return user.getUid();
	}

	public void uploadUserDetail(String name, String email, String password, List<String> roles) {
		User user=new User(name, email, password, roles);
		repo.save(user);
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//1)load model class user object by email(username)
		System.out.println(username);
		Optional<User> op = repo.findByEmail(username);
		org.springframework.security.core.userdetails.User usr =null;
		if(op.isPresent()) {
			User user=op.get();
			System.out.println("===================");
			System.out.println(user);
			/*
			 * List<String> roles = user.getRoles();
			Set<GrantedAuthority> gas = new HashSet<>();
			for(String role:roles) {
				gas.add(new SimpleGrantedAuthority(role));
			}
			
			
			we can writesame code  by usig stram
			 */
			Set<SimpleGrantedAuthority> gas = user.getRoles().stream().map(role->new SimpleGrantedAuthority(role)).collect(Collectors.toSet());
			System.out.println(gas);
			 usr = new org.springframework.security.core.userdetails.User(username, user.getPassword(), gas);
			System.out.println(usr);
		}else {
			throw new UsernameNotFoundException("User Not Found "+username );
		}
		
		return usr;
	}

}
