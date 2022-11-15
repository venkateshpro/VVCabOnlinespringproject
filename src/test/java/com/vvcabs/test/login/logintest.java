package com.vvcabs.test.login;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.vvcabs.VvCabsOnlineApplication;
import com.vvcabs.ControllerImpl.LoginControllerImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=VvCabsOnlineApplication.class)
@AutoConfigureMockMvc
public class logintest {
	
	
	@Autowired
	LoginControllerImpl logincontroller;
	
	
	@Autowired
	private MockMvc mockmvc;
	
	@Test
	public void testloginform() throws Exception {
		mockmvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("Login.jsp")).andReturn();
	
	}
//	@Test
//	public void testvalidation() throws Exception {
//		
//		mockmvc.perform(get("/validate").param("ch", "customer")).andExpect(view().name("Homepage.jsp")).andReturn();
//		mockmvc.perform(get("/validate").param("ch", "driver")).andExpect(view().name("Driver.jsp")).andReturn();
//		mockmvc.perform(get("/validate").param("ch", "admin")).andExpect(view().name("Admin.jsp")).andReturn();
//
//	}

}
