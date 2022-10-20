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
import com.vvcabs.Model.cab_Driver;
import com.vvcabs.repo.driverrepo;
import com.vvcabs.service.driverService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=VvCabsOnlineApplication.class)
public class drivertest {
	@MockBean
	driverrepo driverrepo;
	@Autowired
	driverService driverservice;
	
	@Autowired
	cab_Driver d;
	
	@Test
	public void savecab_DriverTest() {
		cab_Driver driver = new cab_Driver(1,"d@1","1111","vek",2020,4,"6565");
		when(driverrepo.save(driver)).thenReturn(driver);
		assertEquals(driver, driverservice.addcab(driver));
	}
	
	@Test
	public void getCabdriverTest() {
		when(driverrepo.findAll()).thenReturn(Stream
				.of(new cab_Driver(1,"d@1","1111","vek",2020,4,"6565"), new cab_Driver(2, "v@3","333","naga",5656,4,"9999")).collect(Collectors.toList()));
		assertEquals(2, driverservice.get_driverlist().size());
	}
	@Test
    public void testdriverid() {
      
        d.setD_Id(101);
        assertTrue(d.getD_Id() == 101);
    }
	@Test
    public void testdrivername() {
      
        d.setDriver_name("venkat");
        assertTrue(d.getDriver_name() == "venkat");
    }
	
	@Test
    public void testdriverphone() {
      
        d.setDriver_phonenum("9999");
        assertTrue(d.getDriver_phonenum() == "9999");
    }
	@Test
    public void testdriveremail() {
      
        d.setEmail("d@1");
        assertTrue(d.getEmail() == "d@1");
    }
	
	@Test
    public void testdriverpsw() {
      
        d.setPsw("9999");
        assertTrue(d.getPsw() == "9999");
    }
	
	@Test
    public void testdrivercabno() {
      
        d.setCab_no(999);
        assertTrue(d.getCab_no() == 999);
    }
	@Test
    public void testdrivercabtype() {
      
        d.setCab_type(999);
        assertTrue(d.getCab_type() == 999);
    }
	
	
	
	

}
