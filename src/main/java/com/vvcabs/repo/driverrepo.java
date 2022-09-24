package com.vvcabs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vvcabs.Model.Customer;
import com.vvcabs.Model.cab_Driver;
@Repository
public interface driverrepo extends JpaRepository <cab_Driver,Integer> {

}
