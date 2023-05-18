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
//	http
//	.authorizeRequests()
//	.antMatchers("/dashboard").authenticated()
//	.antMatchers("/home").permitAll()
//	.and()
//	.formLogin()
//	.and()
//	.httpBasic();
//	
	
	
	//To Deny all the Http Requests
	
	
//	  http
//	.authorizeRequests()
//	.anyRequest()
//	.denyAll()
//	.and()
//	.httpBasic();
//	
	//-------------------------------------------
	
//	http
//	.authorizeRequests()
//	.antMatchers("/user/**").permitAll()
//	.antMatchers("/admin/**").denyAll()
//	.and()
//	.httpBasic();
	//======================================================
	
	http
	.csrf().disable()
	.authorizeRequests()
	.antMatchers("/register").permitAll()
	.anyRequest().authenticated()
	.and()
	.httpBasic();
}
	
	
	//to custumize multiple users
	/*@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("nagaraju").password("12345").authorities("admin")
		.and()
		.withUser("arjun").password("12345").authorities("user")
		.and()
		.passwordEncoder(NoOpPasswordEncoder.getInstance());
	}*/
@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*
		 * InMemoryUserDetailsManager userDetails = new InMemoryUserDetailsManager();
		 * 
		 * //InMemoryUserDetailsManager is the implimentetion of "UserDetailsService"
		UserDetails user1 = User.withUsername("nagaraju").password("12345").authorities("admin").build();
		UserDetails user2 = User.withUsername("arjun").password("12345").authorities("user").build();
		//build()==> give us to the userDetails
		userDetails.createUser(user1);
		userDetails.createUser(user2);
		auth.userDetailsService(userDetails);
		 */
	
	auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
		
	}
@Bean
public PasswordEncoder passwordEncoder() {
	
	//return NoOpPasswordEncoder.getInstance();
	//to encode the password spring provide a class is called BCryptPasswordEncoder
	return new BCryptPasswordEncoder();
	
}


}
