package com.vvcabs.Model;

import org.springframework.stereotype.Component;

@Component
public class loginp {
	
	String email;
	String psw;
	String who;
	
	
	public loginp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public loginp(String email, String psw, String who) {
		super();
		this.email = email;
		this.psw = psw;
		this.who = who;
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
	public String getWho() {
		return who;
	}
	public void setWho(String who) {
		this.who = who;
	}

	@Override
	public String toString() {
		return "login [email=" + email + ", psw=" + psw + ", who=" + who + "]";
	}
	

}
