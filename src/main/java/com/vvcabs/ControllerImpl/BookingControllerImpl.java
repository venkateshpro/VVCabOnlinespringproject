package com.vvcabs.ControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vvcabs.Controller.BookingController;
import com.vvcabs.serviceImpl.BookingServiceImpl;


/**
*
* @author Naga Venkatesh
*/
@Controller
public class BookingControllerImpl implements BookingController{
	
	@Autowired
	BookingServiceImpl bs;
	
	Logger logger=LoggerFactory.getLogger(BookingControllerImpl.class);
	ModelAndView mview = new ModelAndView();	
	
	
	@GetMapping("/bookinglist")
	public ModelAndView recentbooking() {
		mview.addObject("booking", bs.bookinglist());
		mview.setViewName("list_of_booking.jsp");
		logger.info("List Of Booking");
		return mview;

	}

}
