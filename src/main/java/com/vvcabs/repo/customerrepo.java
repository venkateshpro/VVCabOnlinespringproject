package com.vvcabs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vvcabs.Model.Customer;
@Repository
public interface customerrepo  extends JpaRepository <Customer,Integer> {
//	//Customer findByName(String user_name);
//	@Query(value = "select user_email,user_psw from Customer", nativeQuery = true)
//	 List<String> findByEmail();
}
