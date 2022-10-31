package com.vvcabs.Model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

/**
*
* @author Naga Venkatesh
*/
@Entity
@Component
public class booking {
	
	@Id
	@GenericGenerator(strategy="increment", name = "")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int b_Id;
	
	
	private int  r_Id;
	
	
	
	@ManyToOne
	private Customer customer;
	

	
	@ManyToOne
	private cab_Driver driver;
	
	@Column
	private String cus_name;
	
	@Column
	private String pickup_location;
	
	@Column
	private String drop_location;
	
	@Column
	private int price;
	
	

	public booking() {
		super();
	}



	public booking(int b_Id, int r_Id, Customer customer, cab_Driver driver, String cus_name, String pickup_location,
			String drop_location, int price) {
		super();
		this.b_Id = b_Id;
		this.r_Id = r_Id;
		this.customer = customer;
		this.driver = driver;
		this.cus_name = cus_name;
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



	public cab_Driver getDriver() {
		return driver;
	}



	public void setDriver(cab_Driver driver) {
		this.driver = driver;
	}



	public String getCus_name() {
		return cus_name;
	}



	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
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






	




	
	

	

	
	
	
	
	

}
