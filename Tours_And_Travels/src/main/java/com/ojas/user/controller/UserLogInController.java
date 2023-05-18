package com.ojas.user.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ojas.user.entity.User;
import com.ojas.user.service.UserServiceImpl;

//@RestController
@Controller
public class UserLogInController {
	@Autowired
	private UserServiceImpl userService;
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav=new ModelAndView("login");
		mav.addObject("user", new User());
		return mav;
		
	}
	@PostMapping("/login")
	public String login(@ModelAttribute("user") User user) {
		User oauthUser=userService.login(user.getUsername(), user.getPassword());
		System.out.println(oauthUser);
		if(Objects.nonNull(oauthUser)) {
			return "redirect:/welcome";
		}else {
			return "redirect:/login";
		}
		
		
	}
	@RequestMapping(value= {"/logout"},method=RequestMethod.POST)
	public String logoutDo(HttpServletRequest request, HttpServletResponse responce) {
		return "redirect:/login";
	}
	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "index";
		
	}
	
}
