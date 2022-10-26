package com.vvcabs.ControllerImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.vvcabs.Controller.CustomerController;
import com.vvcabs.Model.Customer;
import com.vvcabs.Model.booking;
import com.vvcabs.Model.request;
import com.vvcabs.service.CustomerServiceImpl;

@RestController
public class CustomerControllerImpl implements CustomerController{

	String pick;
	String drop;
	int r_id;
	int cus_id;
	String cus_name;
	
	
	
	Logger logger=LoggerFactory.getLogger(CustomerControllerImpl.class);


	@Autowired
	private CustomerServiceImpl cusservice;
	
	@Autowired
	private LoginControllerImpl lc;

	@GetMapping("/newuser")
	public ModelAndView userform() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Registration_user.jsp");
		logger.info("Customer Registration");
		
		
		return modelAndView;
	} 

	@PostMapping("/adduser")
	public ModelAndView addCustomer(@ModelAttribute Customer customer) {
		cusservice.savecustomer(customer);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("alertsuc.jsp");
		logger.info("Customer Added Sucessfully");

		return modelAndView;
	}

	@GetMapping("/listcus")
	public ModelAndView showlistcustomers() {
		ModelAndView mview = new ModelAndView();
		mview.addObject("listUsers", cusservice.get_customer());
		mview.setViewName("list_of_u.jsp");
		logger.info("List of Customers Has displyed ");

		return mview;

	}

	@PostMapping("/requestcab") // this method collecting directios
	public ModelAndView requestCab(@ModelAttribute request req) {
		if (cusservice.get_customer().isEmpty()) {
		
			logger.error("noo cabs are available At this time ");

		} else {
			cusservice.saverequest(req);
			 pick = req.getPickup_location();
			 drop = req.getDrop_location();
			 r_id=req.getR_Id();
			 cus_id=req.getCustomer().getUser_Id();
			 cus_name=req.getCustomer().getUser_name();
			ModelAndView modelAndView = new ModelAndView();
			logger.info("Plz Select the Cab And Intaite Booking");
			modelAndView.setViewName("reqestsuccess.jsp");
			return modelAndView;

		}
		return null;

	}

	@GetMapping("/recentbooking")
	public ModelAndView recentbooking() {
		ModelAndView mview = new ModelAndView();
		logger.info("List of Booking Intiated By the User");
		int c_id = lc.cus_id;
		List<booking> bl = new ArrayList<>();
		bl.addAll(cusservice.recentbookings(c_id));
		mview.addObject("recentbooking", bl);
		mview.setViewName("list_of_recent_booking.jsp");
		return mview;

	}
}
