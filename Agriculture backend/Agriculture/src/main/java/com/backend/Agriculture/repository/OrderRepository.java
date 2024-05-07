package com.backend.Agriculture.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.Agriculture.entities.Customer;
import com.backend.Agriculture.entities.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer>{
	
	List<Orders> findByCustomer(Customer customer);
	
}
