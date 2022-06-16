package com.imortaweb.curso1.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imortaweb.curso1.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
