package com.vvcabs.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vvcabs.Model.Customer;
@Repository
public interface customerrepo  extends JpaRepository <Customer,Integer> {
	public static final String email_psw = "select * from customer c where c.user_email=?1 and c.user_psw=?2";
	@Query(value=email_psw,nativeQuery = true)
	public Customer findByEmailAndPassword(String user_email,String user_psw);
	
	
}




//public static final String email_psw = "select * from customer c where c.user_email=?1 and c.user_psw=?2";
//@Query(value="select count(*) from Customer s where s.user_email=?1 and s. user_psw=?2", nativeQuery = true)
//int verifyCredentails(String email,String psw);
//
//@Query(value = email_psw, nativeQuery = true)
//Customer findemailpsw(String email, String psw);