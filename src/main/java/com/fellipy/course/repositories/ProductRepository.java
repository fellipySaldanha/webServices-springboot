package com.fellipy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fellipy.course.entities.Category;
import com.fellipy.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
