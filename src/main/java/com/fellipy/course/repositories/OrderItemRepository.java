package com.fellipy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fellipy.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
