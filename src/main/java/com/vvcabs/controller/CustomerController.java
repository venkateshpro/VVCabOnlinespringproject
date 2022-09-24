package com.vvcabs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vvcabs.Model.Customer;
import com.vvcabs.repo.customerrepo;
import com.vvcabs.service.customerService;

@Controller
public class CustomerController {
	
	customerrepo cusr;
	
	@Autowired
	private customerService cusservice;
	
	@GetMapping("/newuser")
	public String userform() {
		return "Registration_user";
	}
	
	@PostMapping("/adduser")
	    public String addProduct(@ModelAttribute Customer customer) {
		
			cusservice.savecustomer(customer);
	        return "alertsuc";
	    }
	 
	@GetMapping("/listofcus")
	public ModelAndView findlistofcus(){
		
		List<Customer> l= new ArrayList<>();
		l.addAll(cusservice.get_customer());

		ModelAndView mv= new ModelAndView();
		
		mv.addObject(l);
		mv.setViewName("ListofUsers");
		 
		 System.out.println(mv);
		return mv;
	}
//	@RequestMapping("/d")
//	public void ep(@ModelAttribute Customer cus,Model m) {
//		
//		
//		System.out.println(cusr.findByEmailAndPass(cus.getUser_email(),cus.getUser_psw() ));;
//	}
	

}
