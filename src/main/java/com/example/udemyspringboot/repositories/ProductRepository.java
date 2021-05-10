package com.example.udemyspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.udemyspringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
