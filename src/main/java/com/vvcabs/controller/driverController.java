package com.vvcabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vvcabs.Model.Customer;
import com.vvcabs.Model.cab_Driver;
import com.vvcabs.service.driverService;
@Controller
public class driverController {
	@Autowired
	private driverService dservice;
	
	
	@GetMapping("/newcab")
	public String newcab(){
		return "Registration_Cab";
	}
	
	@PostMapping("/adddriverandcab")
	public String addcab(@ModelAttribute  cab_Driver c) {
		
		System.out.println( c.toString());
		dservice.addcab(c);
		return "alertsuc";
	}
	@GetMapping("/listofdriver")
	public List <cab_Driver> findlistofcus(){
		
		
		return dservice.get_driverlist();
	}


}
