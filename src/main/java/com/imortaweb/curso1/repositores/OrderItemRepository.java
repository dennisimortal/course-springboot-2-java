package com.imortaweb.curso1.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imortaweb.curso1.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
