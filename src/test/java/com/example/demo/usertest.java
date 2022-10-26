package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vvcabs.VvCabsOnlineApplication;
import com.vvcabs.Model.Customer;
import com.vvcabs.repo.customerrepo;
import com.vvcabs.service.CustomerServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=VvCabsOnlineApplication.class)
public class usertest {

	@Autowired
	CustomerServiceImpl cusservice;
	@MockBean
	customerrepo cusrepo;
	@Autowired
	Customer customer;
	
	
	
	@Test
	public void saveUserTest() {
		Customer cus = new Customer(1, "v@1","1111","1111","thor");
		when(cusrepo.save(cus)).thenReturn(cus);
		assertEquals(cus, cusservice.savecustomer(cus));
	}
	@Test
	public void getUsersTest() {
		when(cusrepo.findAll()).thenReturn(Stream
				.of(new Customer(1, "v@1","1111","1111","thor"), new Customer(2, "v@3","333","3333","ironman")).collect(Collectors.toList()));
		assertEquals(2, cusservice.get_customer().size());
	}
//	@Test
//	public void getUsersbyidTest() {
//		when(cusrepo.findAll()).thenReturn(Stream
//				.of(new Customer(1, "v@1","1111","1111","thor")).collect(Collectors.toList()));
//		assertEquals(1,cusservice.get_Driver_by_Id(1));
//	}
//	
	
	
	
	@Test
	public void testuseremail()  {
		
		 customer.setUser_email("venky@1");;
	        assertTrue(customer.getUser_email() == "venky@1");
		
	}
	  @Test
	    public void testusername() {
	      
	        customer.setUser_name("venky");;
	        assertTrue(customer.getUser_name() == "venky");
	    }
	  	@Test
	    public void testuserphone() {
	      
	        customer.setUser_phone("99999");;
	        assertTrue(customer.getUser_phone() == "99999");
	    }
		@Test
	    public void testuserpsw() {
	      
	        customer.setUser_psw("psw");;
	        assertTrue(customer.getUser_psw() == "psw");
	    }
	  	
	  	@Test
	    public void testuserid() {
	      
	        customer.setUser_Id(101);;
	        assertTrue(customer.getUser_Id() == 101);
	    }
	  	
	  	
	  	
	  
}
