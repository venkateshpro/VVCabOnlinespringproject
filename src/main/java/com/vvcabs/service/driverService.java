package com.vvcabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.vvcabs.Model.Customer;
import com.vvcabs.Model.cab_Driver;
import com.vvcabs.repo.driverrepo;
@Service
public class driverService {
	
	@Autowired
	private driverrepo drepo;
	
	public cab_Driver addcab(cab_Driver c) {
		return drepo.save(c);
		
		
	}
	
	public List <cab_Driver> get_driverlist() {
		return drepo.findAll();
		
	}
	
	public cab_Driver get_Driver_by_Id(int Id) {
		
		return drepo.findById(Id).orElse(null);
	}

}
