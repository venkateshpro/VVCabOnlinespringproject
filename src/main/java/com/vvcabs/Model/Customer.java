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




@Entity
@Table
@Component
public class Customer {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "user_id")
	
	 	int user_Id;
		@Column
		String user_email;
		@Column
		String user_psw;
		@Column
		String user_phone;
		@Column
		String user_name;
		
		@OneToMany(mappedBy = "customer")
		private List<request> request;
		
		@OneToMany(mappedBy = "customer")
		private List<booking> booking;
		
		public Customer() {
			// TODO Auto-generated constructor stub
		}
		public Customer(int user_Id, String user_email, String user_psw, String user_phone, String user_name) {
			super();
			this.user_Id = user_Id;
			this.user_email = user_email;
			this.user_psw = user_psw;
			this.user_phone = user_phone;
			this.user_name = user_name;
		}
		public int getUser_Id() {
			return user_Id;
		}
		public void setUser_Id(int user_Id) {
			this.user_Id = user_Id;
		}
		public String getUser_email() {
			return user_email;
		}
		public void setUser_email(String user_email) {
			this.user_email = user_email;
		}
		public String getUser_psw() {
			return user_psw;
		}
		public void setUser_psw(String user_psw) {
			this.user_psw = user_psw;
		}
		public String getUser_phone() {
			return user_phone;
		}
		public void setUser_phone(String user_phone) {
			this.user_phone = user_phone;
		}
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
		@Override
		public String toString() {
			return "Customer [user_Id=" + user_Id + ", user_email=" + user_email + ", user_psw=" + user_psw
					+ ", user_phone=" + user_phone + ", user_name=" + user_name + "]";
		}
		
		
}
