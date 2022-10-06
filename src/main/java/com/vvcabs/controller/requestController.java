package com.vvcabs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vvcabs.Model.Customer;
import com.vvcabs.Model.request;
import com.vvcabs.service.requestservice;

@RestController
public class requestController {
	
	@Autowired
	requestservice reqs;

	@GetMapping("/listrequest")
	public ModelAndView showlistcus() {
		ModelAndView mview = new ModelAndView();
		List<request> l = new ArrayList<>();
		
		l.addAll(reqs.listof_request());
		
		mview.addObject("list", l);
		mview.setViewName("list_of_req.jsp");
		System.out.println(l);

		return mview;

	}
}
