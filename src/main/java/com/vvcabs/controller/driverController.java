package com.vvcabs.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vvcabs.Model.booking;
import com.vvcabs.Model.cab_Driver;
import com.vvcabs.service.bookingService;
import com.vvcabs.service.driverService;
import com.vvcabs.service.requestservice;

@RestController
public class driverController {
	
	int  price;
	

	@Autowired
	private driverService ds;
	
	@Autowired
	private bookingService bs;
	
	
	@Autowired
	private requestservice rs;
	
	@Autowired
	CustomerController cc;
	
	@Autowired
	private LoginController lc;
	Logger logger=LoggerFactory.getLogger(LoginController.class);


	@GetMapping("/newcab")
	public ModelAndView newcab() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Registration_Cab.jsp");
		logger.info("Cab Raregistraion Form Displyed");
		return modelAndView;
	}

	@PostMapping("/adddriverandcab")
	public ModelAndView addcab(@ModelAttribute cab_Driver c) {
		System.out.println(c.toString());
		logger.info("Cab Raregistraion Successfully");

		ds.addcab(c);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("alertsuc.jsp");
		return modelAndView;
	}

	@GetMapping("/listofdriver")
	public ModelAndView findlistofdriver() {

		ModelAndView mview = new ModelAndView();
		List<cab_Driver> l = new ArrayList<>();
		l.addAll(ds.get_driverlist());

		mview.addObject("listCab", l);
		mview.setViewName("list_of_cabs.jsp");
		logger.info("List Of Cabs Displyed");

		System.out.println(l);

		return mview;
	}
	
	
	@RequestMapping("/confirmbooking")
	public ModelAndView collectprice(@ModelAttribute booking bk) {
		price =bk.getPrice();
		System.out.println(cc.r_id);
		bs.booking(cc.pick,cc.drop,cc.r_id,cc.cus_id,cc.cus_name,price,lc.dri_id);
		ModelAndView mview = new ModelAndView();
		mview.setViewName("bookingcofrim.jsp");
		logger.info("Driver Accepted the user Request");

		rs.deletereq(cc.r_id);
		logger.info("Delete Query Intaited in Request table");


		return mview;
		
		
	}
	
	
	
	
	
	
	
	



}
