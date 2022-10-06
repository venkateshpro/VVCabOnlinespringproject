package com.vvcabs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vvcabs.Model.booking;
import com.vvcabs.Model.cab_Driver;
import com.vvcabs.Model.request;
import com.vvcabs.service.bookingService;
import com.vvcabs.service.customerService;
import com.vvcabs.service.driverService;
import com.vvcabs.service.requestservice;

@RestController
public class driverController {
	
	int  cus_id;
	

	@Autowired
	private customerService cs;
	@Autowired
	private driverService dservice;
	
	@Autowired
	private bookingService bs;
	
	@Autowired
	private requestservice rs;

	@GetMapping("/newcab")
	public ModelAndView newcab() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Registration_Cab.jsp");
		return modelAndView;
	}

	@PostMapping("/adddriverandcab")
	public ModelAndView addcab(@ModelAttribute cab_Driver c) {
		System.out.println(c.toString());
		dservice.addcab(c);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("alertsuc.jsp");
		return modelAndView;
	}

	@GetMapping("/listofdriver")
	public ModelAndView findlistofdriver() {

		ModelAndView mview = new ModelAndView();
		List<cab_Driver> l = new ArrayList<>();
		l.addAll(dservice.get_driverlist());

		mview.addObject("listCab", l);
		mview.setViewName("list_of_cabs.jsp");
		System.out.println(l);

		return mview;
	}
	
	
	@RequestMapping("/confirmbooking")
	public ModelAndView acceptreq(@ModelAttribute booking bk) {
		//bs.booking();
		
		int req_id=bk.getReq_id();
		cus_id = bk.getCustomer().getUser_Id();
		System.out.println(cus_id);
		System.out.println(req_id);
		rs.deletereq(req_id);
		bs.booking(bk);
		//List<booking> rb= new ArrayList<>();
		
		//System.out.println(cs.recentbookings(req_id));
		
		//rs.deletebyid();
		ModelAndView mview = new ModelAndView();
		mview.setViewName("bookingcofrim.jsp");
		return mview;
		
	}
	
	



}
