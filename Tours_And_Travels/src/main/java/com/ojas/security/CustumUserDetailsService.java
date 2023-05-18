package com.ojas.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class CustumUserDetailsService implements UserDetailsService {
	@Autowired
	private com.ojas.user.repository.UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username)  {
	
		return null;
	}


	}


