package com.vvcabs.ControllerImpl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vvcabs.Controller.RequestController;
import com.vvcabs.serviceImpl.RequestserviceImpl;

/**
*
* @author Naga Venkatesh
*/
@RestController
public class RequestControllerImpl implements RequestController{
	
	@Autowired
	RequestserviceImpl reqs;
	
	Logger logger=LoggerFactory.getLogger(LoginControllerImpl.class);
	ModelAndView mview = new ModelAndView();
	


	@GetMapping("/listrequest")
	public ModelAndView showlistcus() {
		mview.addObject("list", reqs.listof_request());
		mview.setViewName("list_of_req.jsp");
		logger.info("List Of Request by Users");
		return mview;

	}
}
