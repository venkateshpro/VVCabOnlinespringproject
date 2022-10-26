package com.vvcabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvcabs.Model.request;
import com.vvcabs.repo.requestrepo;
import com.vvcabs.serives.RequestService;

@Service
public class RequestserviceImpl implements RequestService {

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
