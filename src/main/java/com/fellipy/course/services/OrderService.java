package com.fellipy.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fellipy.course.entities.Order;
import com.fellipy.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAllOrders() {
		return orderRepository.findAll();
	}
		
	public Order findById(Long id) {
		Optional<Order> user = orderRepository.findById(id);
		return user.get();
	}
}
