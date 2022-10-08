package com.vvcabs.repo;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vvcabs.Model.booking;

@Repository
public interface bookingrepo extends JpaRepository<booking, Integer>{
	@Query(value="select* from booking where customer_user_id=0?",nativeQuery = true)
	List<booking> findByCustomerBooking(int user_id);

	
	@Modifying
	@Transactional
	@Query(value="insert into booking(drop_location ,pickup_location ,price ,r_id ,cus_name ,customer_user_id ,driver_d_id )values(:drop,:pick,:price,:r_id,:cus_name,:cus_id,:d_id)",nativeQuery = true)
	void insertBooking(@Param("pick") String pick, @Param("drop")String drop, @Param("r_id")int r_id,@Param("cus_id") int cus_id,@Param("cus_name") String cus_name,@Param("d_id") int d_id, @Param("price")int price);
	

}
