package com.vvcabs.test.Customer;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vvcabs.VvCabsOnlineApplication;
import com.vvcabs.Model.Customer;
import com.vvcabs.repo.bookingrepo;
import com.vvcabs.repo.customerrepo;
import com.vvcabs.serives.CustomerService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=VvCabsOnlineApplication.class)
@AutoConfigureMockMvc
public class CustomerTest {

	@Autowired
	CustomerService cusservice;
	@MockBean
	customerrepo cusrepo;
	@Autowired
	Customer customer;
	@MockBean
	bookingrepo bookingrepo;

	
	@Autowired
	private MockMvc mockmvc;
	
	
		
	@Autowired
	private WebApplicationContext context;
	
	ObjectMapper om = new ObjectMapper();
	
//	@Before
//	public void setUp() {
//		mockmvc = MockMvcBuilders.webAppContextSetup(context).build();
//	}
	
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
	
	@Test
	public void findById(){
		Customer cus = new Customer(1, "v@1","1111","1111","thor");
		 Mockito.when(cusrepo.findById(1)).thenReturn(Optional.of(cus));


	}

	@Test
    public void listofCustomersTest() throws Exception {
		mockmvc.perform(get("/listcus")).andExpect(status().isOk()).andExpect(view().name("list_of_u.jsp")).andReturn();
    }
	@Test
    public void registrationpageTest() throws Exception {
		mockmvc.perform(get("/newuser")).andExpect(status().isOk()).andExpect(view().name("Registration_user.jsp")).andReturn();
    }
	
	@Test
    public void AddCustomerTest() throws Exception {
		mockmvc.perform(get("/adduser")).andExpect(status().is(405)).andExpect(view().name("alertsuc.jsp")).andReturn();
    }
	@Test
    public void RequestTest() throws Exception {
		mockmvc.perform(get("/requestcab")).andExpect(status().is(405)).andExpect(view().name("reqestsuccess.jsp")).andReturn();
    }
	
	@Test
    public void RecentbookingTest() throws Exception {
		mockmvc.perform(get("/recentbooking")).andExpect(status().isOk()).andExpect(view().name("list_of_recent_booking.jsp")).andReturn();
    }


	

	
	
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
