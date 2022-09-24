package com.vvcabs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vvcabs.Model.Customer;
import com.vvcabs.Model.loginp;
import com.vvcabs.repo.customerrepo;
import com.vvcabs.repo.driverrepo;

@Service
public class LoginService {
	customerrepo cusrepo;
	driverrepo drepo;
	
	loginp login;
	
	

//	public List<String> customerlogin() {
//		
//		//List<String> l=cusrepo.findByEmail();
//		//System.out.println(l);
////		List<String> findAll();
//
//		return
//		
//	}
	public void driverlogin(String email,String psw) {
		
		System.out.println(email);
			
	}
	public void adminlogin() {
		
	}
	
}
