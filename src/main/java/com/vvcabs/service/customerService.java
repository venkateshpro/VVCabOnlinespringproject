package com.vvcabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvcabs.Model.Customer;
import com.vvcabs.Model.cab_Driver;
import com.vvcabs.repo.customerrepo;

@Service
public class customerService {
	
	@Autowired
	private customerrepo cusrepo;
	
	
	public Customer savecustomer(Customer customer) {
	   return cusrepo.save(customer);
	}
	
	
	public List <Customer> get_customer() {
		return cusrepo.findAll();
		
	}
	public Customer get_Driver_by_Id(int user_Id) {
		
		return cusrepo.findById(user_Id).orElse(null);
	}
}
