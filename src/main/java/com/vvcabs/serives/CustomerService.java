package com.vvcabs.serives;

import java.util.List;

import com.vvcabs.Model.Customer;
import com.vvcabs.Model.booking;
import com.vvcabs.Model.request;
/**
*
* @author Naga Venkatesh
*/
public interface CustomerService {
	
	public Customer savecustomer(Customer customer);
	public request saverequest(request req);
	public List <Customer> get_customer();
	public Customer get_Driver_by_Id(int user_Id) ;
	public List<booking>  recentbookings(int cus_id);
	
		
}
