package com.example.udemyspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.udemyspringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
