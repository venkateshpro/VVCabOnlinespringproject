package com.vvcabs.Model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.springframework.stereotype.Component;

/**
*
* @author Naga Venkatesh
*/
@Entity
@Component
public class request {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 	int r_Id;
	
	
	
	@ManyToOne
	private Customer customer;
	
	
	@Column
	String pickup_location;
	@Column
	String drop_location;
	
	@Column
	int status=0;
	
	
	public request() {
		super();
	}
	

	public int getR_Id() {
		return r_Id;
	}
	public void setR_Id(int r_Id) {
		this.r_Id = r_Id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getPickup_location() {
		return pickup_location;
	}
	public void setPickup_location(String pickup_location) {
		this.pickup_location = pickup_location;
	}
	public String getDrop_location() {
		return drop_location;
	}
	public void setDrop_location(String drop_location) {
		this.drop_location = drop_location;
	}
	

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public request(int r_Id, Customer customer, String pickup_location, String drop_location, int status) {
		super();
		this.r_Id = r_Id;
		this.customer = customer;
		this.pickup_location = pickup_location;
		this.drop_location = drop_location;
		this.status = status;
	}
	
	
	
	
	
	

}
