package com.vvcabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vvcabs.Model.Customer;
import com.vvcabs.Model.loginp;
import com.vvcabs.service.LoginService;

import antlr.collections.List;

@Controller
public class LoginController {
	
	LoginService ls;
	
	@RequestMapping("/")
	//@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String login() {
		return "login";
	}
	@PostMapping("/Login")
	public String validate_user(@ModelAttribute loginp login) {
		String email=login.getEmail();
		String psw= login.getPsw();
		System.out.println(login.getEmail());
		System.out.println(login.getPsw());
		System.out.println(login.getWho());
		ls.driverlogin(email,psw);
		
		
		 //ls.customerlogin(); 
		//System.out.println(l);
		
		return "";
	}
	

	
	

}
