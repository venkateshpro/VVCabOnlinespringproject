package com.vvcabs.Model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import org.springframework.stereotype.Component;

@Entity
@Component
public class booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int b_Id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="r_Id")
	private request request;
	
	@Column
	private int req_id;
	
	@ManyToOne
	private Customer customer;
	
	@ManyToOne
	private cab_Driver driver;
	
	
	
	@Column
	private String pickup_location;
	
	@Column
	private String drop_location;
	
	@Column
	private int price;

	public booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public booking(int b_Id, int req_id, Customer customer, cab_Driver driver, String pickup_location,
			String drop_location, int price) {
		super();
		this.b_Id = b_Id;
		this.req_id = req_id;
		this.customer = customer;
		this.driver = driver;
		this.pickup_location = pickup_location;
		this.drop_location = drop_location;
		this.price = price;
	}




	public int getB_Id() {
		return b_Id;
	}

	public void setB_Id(int b_Id) {
		this.b_Id = b_Id;
	}
	
	

	public int getReq_id() {
		return req_id;
	}

	public void setReq_id(int req_id) {
		this.req_id = req_id;
	}
//
//	public request getRequest() {
//		return request;
//	}
//
//	public void setRequest(request request) {
//		this.request = request;
//	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public cab_Driver getDriver() {
		return driver;
	}

	public void setDriver(cab_Driver driver) {
		this.driver = driver;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}




	@Override
	public String toString() {
		return "booking [b_Id=" + b_Id + ", req_id=" + req_id + ", customer=" + customer + ", driver=" + driver
				+ ", pickup_location=" + pickup_location + ", drop_location=" + drop_location + ", price=" + price
				+ "]";
	}

	
	
	
	
	

}
