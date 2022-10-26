package com.vvcabs.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.vvcabs.Model.Customer;
import com.vvcabs.Model.request;

public interface CustomerController {

	public ModelAndView userform() ;
	public ModelAndView addCustomer(@ModelAttribute Customer customer);
	public ModelAndView showlistcustomers();
	public ModelAndView requestCab(@ModelAttribute request req);
	public ModelAndView recentbooking();
}
