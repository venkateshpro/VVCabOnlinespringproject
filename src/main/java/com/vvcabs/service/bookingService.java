package com.vvcabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvcabs.Model.booking;
import com.vvcabs.controller.driverController;
import com.vvcabs.repo.bookingrepo;

@Service
public class bookingService {
	@Autowired
	bookingrepo brepo;

	public booking booking(booking bk) {
		// TODO Auto-generated method stub
		
		return brepo.save(bk);
		
	}

	

	
	
}
