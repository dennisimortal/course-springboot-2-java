package com.imortaweb.curso1.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imortaweb.curso1.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
