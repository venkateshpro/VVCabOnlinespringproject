package com.vvcabs.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.vvcabs.Model.Customer;
import com.vvcabs.Model.request;
/**
*
* @author Naga Venkatesh
*/
public interface CustomerController {
	 /**
	    * Using Model and View
	    * for giving the output.
	    * @return  Customer Registration form
	    */
	public ModelAndView userform() ;
	 /**
	    * Using Model and View
	    * for giving the output.
	    * @return The Confrim massage of adding customer success
	    */
	public ModelAndView addCustomer(@ModelAttribute Customer customer);
	/**
	    * Using Model and View
	    * for giving the output.
	    * @return List of Customers has Displyed
	    */
	public ModelAndView showlistcustomers();
	
	/**
	    * Using Model and View
	    * for giving the output.
	    * @return Customer Deleted  Successfully
	    */
	public ModelAndView deleteCustomer(int id ) ;

	/**
	 
	    * Using Model and View
	    * for giving the output.
	    * @return The Confrim massage of Request raised Successfully
	    */
	public ModelAndView requestCab(@ModelAttribute request req);
	/**
	    * Using Model and View
	    * for giving the output.
	    * @return It will Display the List of Booking made by particular Customer.
	    */
	public ModelAndView recentbooking();
}
