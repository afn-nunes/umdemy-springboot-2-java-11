package com.example.udemyspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.udemyspringboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
