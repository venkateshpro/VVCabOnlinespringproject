package com.vvcabs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vvcabs.Model.booking;

public interface bookingrepo extends JpaRepository<booking, Integer>{
	@Query(value="select* from booking where customer_user_id=0?",nativeQuery = true)
	List<booking> findByCustomerBooking(int user_id);

}
