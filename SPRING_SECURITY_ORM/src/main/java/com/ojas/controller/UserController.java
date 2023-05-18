package com.ojas.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.model.User;
import com.ojas.service.UserServiceImpl;
import com.ojas.utility.EmailUtil;

@Controller
public class UserController {
	@Autowired
	private UserServiceImpl service;
	@Autowired
	private BCryptPasswordEncoder pwdEncoder;
	@Autowired
	private EmailUtil emailUtil;
	@GetMapping("/reg")
	public String showReg() {
		return "registationPage.html";
		
	}
	@PostMapping("/insert")
	public String SaveUser(@ModelAttribute User user,HttpSession session) {
		Integer id=service.saveUser(user);
		String msg="User ' "+id+"' saved";
		session.setAttribute("result", msg);
		if(id!=null) {
			String text="User : "+user.getName()+" , created with roles:"+user.getRoles();
			boolean sent=emailUtil.send(user.getEmail(), "WELCOME TO USER!", text);
			if(sent) {
				msg+="-Email Also sent";
			}else {
				msg+="-Email failed to send";
			}
		}
		return "registationPage";
		
	}
	@PostMapping("/upload")
	public String upload(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("password") String password,@RequestParam("roles") List<String> roles, HttpSession session) {
		String encodePwd = pwdEncoder.encode(password);
		service.uploadUserDetail(name,email,encodePwd,roles);
		String msg="SuccessFully Registerd";
		session.setAttribute("result", msg);
		String text="User : "+name+" , created with roles:"+roles;
		boolean sent=emailUtil.send(email, "WELCOME TO USER!", text);
		System.out.println(sent);
		if(sent) {
			msg+="-Email Also sent";
		}else {
			msg+="-Email failed to send";
		}
		return "registationPage";
		
	}
	@GetMapping("/upload")
	public String fileUpload(HttpSession session) throws IllegalStateException, IOException {
		session.setAttribute("result", "No Such Operation Allowed ");
		return "registationPage";
	}
}
