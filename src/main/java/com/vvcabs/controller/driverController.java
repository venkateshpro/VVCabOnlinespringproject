package com.vvcabs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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

	@GetMapping("/newcab")
	public ModelAndView newcab() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Registration_Cab.jsp");
		return modelAndView;
	}

	@PostMapping("/adddriverandcab")
	public ModelAndView addcab(@ModelAttribute cab_Driver c) {
		System.out.println(c.toString());
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
		System.out.println(l);

		return mview;
	}
	
	
//	@RequestMapping("/confirmbooking")
//	public ModelAndView acceptreq(@ModelAttribute booking bk) {
//		
//		int req_id=bk.getReq_id();
//		cus_id = bk.getCustomer().getUser_Id();
//		System.out.println(cus_id);
//		System.out.println(req_id);
//		rs.deletereq(req_id);
//		bs.booking(bk);
//		
//		
//		int d_id=lc.dri_id;
//		//bs.isertbookingId( d_id);
//		ModelAndView mview = new ModelAndView();
//		mview.setViewName("bookingcofrim.jsp");
//		return mview;
//		
//	}
	
	@RequestMapping("/confirmbooking")
	public ModelAndView collectprice(@ModelAttribute booking bk) {
		price =bk.getPrice();
		System.out.println(cc.r_id);
		bs.booking(cc.pick,cc.drop,cc.r_id,cc.cus_id,cc.cus_name,price,lc.dri_id);
		ModelAndView mview = new ModelAndView();
		mview.setViewName("bookingcofrim.jsp");
		rs.deletereq(cc.r_id);

		return mview;
		
		
	}
	
	
	
	
	
	
	
	



}
