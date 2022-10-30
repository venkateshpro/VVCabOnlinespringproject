package com.vvcabs.test.booking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.vvcabs.VvCabsOnlineApplication;
import com.vvcabs.Model.Customer;
import com.vvcabs.Model.booking;
import com.vvcabs.Model.cab_Driver;
import com.vvcabs.repo.bookingrepo;
import com.vvcabs.serives.BookingService;
import com.vvcabs.serives.CustomerService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=VvCabsOnlineApplication.class)
public class bookingtest {
	@MockBean
	bookingrepo bookinrepo;
	
	@Mock
	bookingrepo bookinrepo1;
	
	
	
	@Autowired
	BookingService bookservice;
	
	@Autowired
	booking bookings;
	@Autowired
	Customer customer;
	@Autowired
	cab_Driver driver;
	@Autowired
	CustomerService cusservice;

	@Test
	public void getbookingTest() {
		when(bookinrepo.findAll()).thenReturn(Stream.of(new booking(1,1,customer,driver,"vvv","knl","drop",220), new booking(2,2,customer,driver,"vvv","knl","drop",220)).collect(Collectors.toList()));
		assertEquals(2, bookservice.bookinglist().size());
	}
	@Test
    public void testbookingid() {
      
		bookings.setB_Id(101);
        assertTrue(bookings.getB_Id() == 101);
    }
	@Test
    public void testbookingreqid() {
      
		bookings.setR_Id(101);
        assertTrue(bookings.getR_Id() == 101);
    }
	@Test
    public void testbookingcus() {
      
		bookings.setCustomer(customer);
        assertTrue(bookings.getCustomer() == customer);
    }
	
	@Test
    public void testbookingdriver() {
      
		bookings.setDriver(driver);
        assertTrue(bookings.getDriver() == driver);
    }
	@Test
    public void testbookingcus_name() {
      
		bookings.setCus_name("venkat");
        assertTrue(bookings.getCus_name() == "venkat");
    }
	@Test
    public void testbookingpick() {
      
		bookings.setPickup_location("hyd");
        assertTrue(bookings.getPickup_location() == "hyd");
    }
	@Test
    public void testbookingdrop() {
      
		bookings.setDrop_location("hyd");
        assertTrue(bookings.getDrop_location() == "hyd");
    }
	@Test
    public void testbookingprice() {
      
		bookings.setPrice(99);
        assertTrue(bookings.getPrice() == 99);
    }
	
	
	
	@Test
	public void findById(){
		booking b=new booking(1,1,customer,driver,"vvv","knl","drop",220);
		 Mockito.when(bookinrepo1.findById(1)).thenReturn(Optional.of(b));


	}
	

}
