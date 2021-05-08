package com.example.udemyspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.udemyspringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
