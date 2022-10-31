package com.vvcabs.Controller;

import org.springframework.web.servlet.ModelAndView;

/**
*
* @author Naga Venkatesh
*/
public interface BookingController {
	
	/**
     * Using Model and View
     * for giving the output.
     * @return List of Bookings
     */
	public ModelAndView recentbooking();
	
	
}
