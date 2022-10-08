package com.vvcabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvcabs.Model.Customer;
import com.vvcabs.Model.booking;
import com.vvcabs.Model.request;
import com.vvcabs.repo.bookingrepo;
import com.vvcabs.repo.customerrepo;
import com.vvcabs.repo.requestrepo;

@Service
public class customerService {
	
	@Autowired
	customerrepo cusrepo;
	@Autowired
	bookingrepo brepo;
	@Autowired
	requestrepo reqrepo;
	
	public Customer savecustomer(Customer customer) {
		
	   return cusrepo.save(customer);
	   
	}
	
	public request saverequest(request req) {
		
		return reqrepo.save(req);
	}
	
	
	public List <Customer> get_customer() {
		return cusrepo.findAll();
		
	}
	public Customer get_Driver_by_Id(int user_Id) {
		
		return cusrepo.findById(user_Id).orElse(null);
	}

	public List<booking>  recentbookings(int cus_id) {
		
		return brepo.findByCustomerBooking(cus_id);
		
		
	}
	
	
	
}
