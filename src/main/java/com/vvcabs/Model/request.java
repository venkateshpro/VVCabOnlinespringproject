package com.vvcabs.Model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;


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
	
	
//	@OneToOne(mappedBy = "request")
//	private List<booking> booking;
	
	public request() {
		super();
		// TODO Auto-generated constructor stub
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
	
	@Override
	public String toString() {
		return "request [r_Id=" + r_Id + ", customer=" + customer + ", pickup_location=" + pickup_location
				+ ", drop_location=" + drop_location + ", status=" + status + "]";
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
