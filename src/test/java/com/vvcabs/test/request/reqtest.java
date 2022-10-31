package com.vvcabs.test.request;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.vvcabs.VvCabsOnlineApplication;
import com.vvcabs.Model.Customer;
import com.vvcabs.Model.cab_Driver;
import com.vvcabs.Model.request;
import com.vvcabs.repo.requestrepo;
import com.vvcabs.serives.CustomerService;
import com.vvcabs.serives.RequestService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=VvCabsOnlineApplication.class)
@AutoConfigureMockMvc
public class reqtest {
	
	@Autowired
	RequestService reqservice;
	
	@MockBean
	requestrepo reqrepo;
	
	@Autowired
	request req;
	
	
	@Autowired
	Customer cusomer;
	@Autowired
	cab_Driver driver;
	
	@Autowired
	private MockMvc mockmvc;
	
	@Autowired
	CustomerService cusservice;
	
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
	
	@Test
    public void ListofrequestTest() throws Exception {
		mockmvc.perform(get("/listrequest")).andExpect(status().isOk()).andExpect(view().name("list_of_req.jsp")).andReturn();
    }
	
	 @Test
	    void delete() {
	       

	        when(reqrepo.findById(1)).thenReturn(Optional.of(req));

	        reqservice.deletereq(1);

	        verify(reqrepo).deleteById(1);

	    }
	
	
	
	
	

}
