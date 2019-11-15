package com.fellipy.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fellipy.course.entities.Category;
import com.fellipy.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAllCategorys() {
		return categoryRepository.findAll();
	}
		
	public Category findById(Long id) {
		Optional<Category> user = categoryRepository.findById(id);
		return user.get();
	}
}
