package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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
import com.vvcabs.Model.cab_Driver;
import com.vvcabs.Model.request;
import com.vvcabs.repo.requestrepo;
import com.vvcabs.service.customerService;
import com.vvcabs.service.requestservice;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=VvCabsOnlineApplication.class)
public class reqtest {
	
	@Autowired
	requestservice reqservice;
	
	@MockBean
	requestrepo reqrepo;
	
	@Autowired
	request req;
	
	
	@Autowired
	Customer cusomer;
	@Autowired
	cab_Driver driver;
	
	@Autowired
	customerService cusservice;
	
	@Test
	public void getrequestTest() {
		when(reqrepo.findAll()).thenReturn(Stream.of(new request(1,cusomer,"hyd","knl",0), new request(2,cusomer,"knl","hyd",0)).collect(Collectors.toList()));
		assertEquals(2, reqservice.listof_request().size());
	}
	
	@Test
	public void saverequestTest() {
		request req = new request(1,cusomer,"hyd","knl",0);
		when(reqrepo.save(req)).thenReturn(req);
		assertEquals(req,cusservice.saverequest(req));
	}
	@Test
    public void testreqid() {
      
		req.setR_Id(999);
        assertTrue(req.getR_Id() == 999);
    }
	
	@Test
    public void testreqpick() {
      
		req.setPickup_location("hyd");
        assertTrue(req.getPickup_location() == "hyd");
    }
	@Test
    public void testreqdrop() {
      
		req.setDrop_location("hyd");
        assertTrue(req.getDrop_location() == "hyd");
    }
	@Test
    public void testreqcustomer() {
      
		req.setCustomer(cusomer);
        assertTrue(req.getCustomer() == cusomer);
    }
	
	@Test
    public void testreqstatus() {
      
		req.setStatus(0);
        assertTrue(req.getStatus() == 0);
    }
	
	
	
	
	
	
	
	
	
	

}
