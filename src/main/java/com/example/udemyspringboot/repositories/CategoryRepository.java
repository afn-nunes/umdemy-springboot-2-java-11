package com.example.udemyspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.udemyspringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
