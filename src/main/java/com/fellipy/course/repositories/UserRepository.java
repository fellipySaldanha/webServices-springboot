package com.fellipy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fellipy.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
