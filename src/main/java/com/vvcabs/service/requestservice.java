package com.vvcabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvcabs.Model.request;
import com.vvcabs.repo.requestrepo;

@Service
public class requestservice {

	@Autowired
	requestrepo reqrepo;
	
	@Autowired
	request req;
	
	public List<request> listof_request() {
		return reqrepo.findAll();
	}

	public void deletereq(int req) {
		
		
		 reqrepo.deleteById(req);
		
	}
	

	
	
	
}
