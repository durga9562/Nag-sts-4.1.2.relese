package com.ojas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.ojas.security.CustumUserDetailsService;
@Configuration
public class MySecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired 
	CustumUserDetailsService userDetailsService;
	
@Override
protected void configure(HttpSecurity http) throws Exception {
	http
	.csrf().disable()
	.authorizeRequests()
	.antMatchers("/register").permitAll()
	.anyRequest().authenticated()
	.and()
	.httpBasic();
}
@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
	auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
		
	}
@Bean
public PasswordEncoder passwordEncoder() {
	
	return new BCryptPasswordEncoder();
	
}


}
