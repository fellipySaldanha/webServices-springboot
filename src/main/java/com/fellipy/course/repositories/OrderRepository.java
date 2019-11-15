package com.fellipy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fellipy.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
