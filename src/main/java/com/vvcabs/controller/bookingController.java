package com.vvcabs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vvcabs.Model.booking;
import com.vvcabs.service.bookingService;

@Controller
public class bookingController {
	
	@Autowired
	bookingService bs;
	
	
	@GetMapping("/bookinglist")
	public ModelAndView recentbooking() {
		ModelAndView mview = new ModelAndView();

		List<booking> bl = new ArrayList<>();
		bl.addAll(bs.bookinglist());
		mview.addObject("booking", bl);
		mview.setViewName("list_of_booking.jsp");

		System.out.println(bl);

		return mview;

	}

}
