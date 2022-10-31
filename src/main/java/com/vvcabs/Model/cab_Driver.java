package com.vvcabs.Model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


/**
*
* @author Naga Venkatesh
*/
@Entity
@Table
@Component
public class cab_Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int d_Id;
	
	@OneToMany(mappedBy = "driver")
	private List<booking> booking;
	
	@Column
	private String email;
	@Column
	private String psw;
	@Column
	String driver_name;
	@Column
	private int cab_no;
	@Column
	private int cab_type;
	
	@Column
	String driver_phonenum;
	
	

	public cab_Driver() {
		super();
	}

	public cab_Driver(int d_Id, String email, String psw, String driver_name, int cab_no, int cab_type,
			String driver_phonenum) {
		super();
		this.d_Id = d_Id;
		this.email = email;
		this.psw = psw;
		this.driver_name = driver_name;
		this.cab_no = cab_no;
		this.cab_type = cab_type;
		this.driver_phonenum = driver_phonenum;
	}

	public int getD_Id() {
		return d_Id;
	}

	public void setD_Id(int d_Id) {
		this.d_Id = d_Id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getDriver_name() {
		return driver_name;
	}

	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}

	public int getCab_no() {
		return cab_no;
	}

	public void setCab_no(int cab_no) {
		this.cab_no = cab_no;
	}

	public int getCab_type() {
		return cab_type;
	}

	public void setCab_type(int cab_type) {
		this.cab_type = cab_type;
	}

	public String getDriver_phonenum() {
		return driver_phonenum;
	}

	public void setDriver_phonenum(String driver_phonenum) {
		this.driver_phonenum = driver_phonenum;
	}


	
	

}
