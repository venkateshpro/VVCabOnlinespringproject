package com.vvcabs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vvcabs.Model.Customer;
import com.vvcabs.Model.cab_Driver;
@Repository
public interface driverrepo extends JpaRepository <cab_Driver,Integer> {
	public static final String email_psw = "select * from cab_driver d where d.email=?1 and d.psw=?2";
	@Query(value=email_psw,nativeQuery = true)
	public cab_Driver findByEmailAndPassword(String email,String psw);

}
