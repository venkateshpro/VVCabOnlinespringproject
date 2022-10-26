package com.vvcabs.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.vvcabs.Model.booking;
import com.vvcabs.Model.cab_Driver;


public interface Driver_CabController {
	public ModelAndView newcabform();
	public ModelAndView addcab(@ModelAttribute cab_Driver driver) ;
	public ModelAndView findlistofdriver();
	public ModelAndView collectprice(@ModelAttribute booking bk);


}
