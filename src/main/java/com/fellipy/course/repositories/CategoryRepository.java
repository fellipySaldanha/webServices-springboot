package com.fellipy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fellipy.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
