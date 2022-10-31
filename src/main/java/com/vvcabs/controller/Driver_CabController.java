package com.vvcabs.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.vvcabs.Model.booking;
import com.vvcabs.Model.cab_Driver;


public interface Driver_CabController {
	 /**
	    * Using Model and View
	    * for giving the output.
	    * @return  CabDriver Registration form
	    */
	public ModelAndView newcabform();
	
	 /**
	    * Using Model and View
	    * for giving the output.
	    * @return The Confrim massage of adding CabDriver success
	    */
	public ModelAndView addcab(@ModelAttribute cab_Driver driver) ;
	
	/**
	    * Using Model and View
	    * for giving the output.
	    * @return List of Cab drivers has Displyed
	    */
	public ModelAndView findlistofdriver();
	
	/**
	    * Using Model and View
	    * for giving the output.
	    * @return The Confrim massage of Request Accepted Successfully
	    */
	public ModelAndView collectprice(@ModelAttribute booking bk);
	
	/**
	    * Using Model and View
	    * for giving the output.
	    * @return Cab driver Deleted  Successfully
	    */
	public ModelAndView deleteCabdriver( int id );


}
