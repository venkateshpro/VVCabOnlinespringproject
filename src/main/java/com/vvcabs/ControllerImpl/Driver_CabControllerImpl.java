package com.vvcabs.ControllerImpl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vvcabs.Controller.Driver_CabController;
import com.vvcabs.Model.booking;
import com.vvcabs.Model.cab_Driver;
import com.vvcabs.serviceImpl.BookingServiceImpl;
import com.vvcabs.serviceImpl.DriverServiceImpl;
import com.vvcabs.serviceImpl.RequestserviceImpl;

@RestController
public class Driver_CabControllerImpl  implements Driver_CabController{
	
	int  price;
	

	@Autowired
	private DriverServiceImpl ds;
	
	@Autowired
	private BookingServiceImpl bs;
	
	
	@Autowired
	private RequestserviceImpl rs;
	
	@Autowired
	CustomerControllerImpl cc;
	
	@Autowired
	private LoginControllerImpl lc;
	Logger logger=LoggerFactory.getLogger(LoginControllerImpl.class);

	ModelAndView mview = new ModelAndView();


	@GetMapping("/newcab")
	public ModelAndView newcabform() {
		mview.setViewName("Registration_Cab.jsp");
		logger.info("Cab Raregistraion Form Displyed");
		return mview;
	}

	@PostMapping("/adddriverandcab")
	public ModelAndView addcab(@ModelAttribute cab_Driver driver) {
		logger.info("Cab Raregistraion Successfully");
		ds.addcab(driver);
		mview.setViewName("alertsuc.jsp");
		return mview;
	}

	@GetMapping("/listofdriver")
	public ModelAndView findlistofdriver() {
		mview.addObject("listCab", ds.get_driverlist());
		mview.setViewName("list_of_cabs.jsp");
		logger.info("List Of Cabs Displyed");
		return mview;
	}
	
	
	@RequestMapping("/confirmbooking")
	public ModelAndView collectprice(@ModelAttribute booking bk) {
		price =bk.getPrice();
		bs.booking(cc.pick,cc.drop,cc.r_id,cc.cus_id,cc.cus_name,price,lc.dri_id);
		mview.setViewName("bookingcofrim.jsp");
		logger.info("Driver Accepted the user Request");
		rs.deletereq(cc.r_id);
		logger.info("Delete Query Intaited in Request table");
		return mview;
		
		
	}

	
	
	
	
	
	
	
	
	



}
