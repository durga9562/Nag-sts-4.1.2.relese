package com.ojas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@SuppressWarnings("deprecation")
@EnableWebSecurity
@Configuration
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private BCryptPasswordEncoder pwdEncoder;
@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.userDetailsService(userDetailsService).passwordEncoder(pwdEncoder);
	
}
@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests()
	//URL-AccessTypes
			.antMatchers("/home","/reg","/upload").permitAll()
			.antMatchers("/welcome").authenticated()
			.antMatchers("/admin").hasAuthority("ADMIN")
			.antMatchers("/emp").hasAuthority("EMPLOYEE")
			.antMatchers("/std").hasAuthority("STUDENT")
			//.anyRequest().hasAuthority("ADMIN")
			//.antMatchers("/common").hasAnyAuthority("ADMIN","EMPLOYEE")
			
			//Login Form Details 
			.and()
			.formLogin()
			.defaultSuccessUrl("/welcome",true)
			
			//Logout Details
			.and()
			.logout()
			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			
			//Exception Details
			.and()
			.exceptionHandling()
			.accessDeniedPage("/denied")
			;

	}
}
