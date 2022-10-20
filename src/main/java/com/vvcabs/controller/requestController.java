package com.vvcabs.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vvcabs.Model.request;
import com.vvcabs.service.requestservice;

@RestController
public class requestController {
	
	@Autowired
	requestservice reqs;
	
	Logger logger=LoggerFactory.getLogger(LoginController.class);


	@GetMapping("/listrequest")
	public ModelAndView showlistcus() {
		ModelAndView mview = new ModelAndView();
		List<request> l = new ArrayList<>();
		
		l.addAll(reqs.listof_request());
	
		mview.addObject("list", l);
		mview.setViewName("list_of_req.jsp");
		logger.info("List Of Request by Users");
		return mview;

	}
}
