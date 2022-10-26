package com.vvcabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvcabs.Model.booking;
import com.vvcabs.repo.bookingrepo;
import com.vvcabs.serives.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	bookingrepo brepo;

	public void booking(String pick, String drop, int r_id, int cus_id, String cus_name, int price,int dri_id) {
		brepo.insertBooking(pick, drop, r_id, cus_id, cus_name, dri_id, price);
		
	}
	
	public List<booking> bookinglist() {
		
		return brepo.findAll();
	}

	



	
	
	
}
