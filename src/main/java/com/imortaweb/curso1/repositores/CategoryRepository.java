package com.imortaweb.curso1.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imortaweb.curso1.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
