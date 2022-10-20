package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.vvcabs.VvCabsOnlineApplication;
import com.vvcabs.Model.Customer;
import com.vvcabs.Model.booking;
import com.vvcabs.Model.cab_Driver;
import com.vvcabs.Model.request;
import com.vvcabs.repo.bookingrepo;
import com.vvcabs.repo.customerrepo;
import com.vvcabs.repo.driverrepo;
import com.vvcabs.repo.requestrepo;
import com.vvcabs.service.bookingService;
import com.vvcabs.service.customerService;
import com.vvcabs.service.driverService;
import com.vvcabs.service.requestservice;




@RunWith(SpringRunner.class)
@SpringBootTest(classes=VvCabsOnlineApplication.class)
class VvCabsOnlineApplicationTests {
	
	

	
	@Autowired
	requestservice reqservice;
	

	@Autowired
	customerService cusservice;
	
	@MockBean
	requestrepo reqrepo;
	
	
	

	@MockBean
	driverrepo driverrepo;
	
	@Autowired
	driverService driverservice;
	

	
	



}
