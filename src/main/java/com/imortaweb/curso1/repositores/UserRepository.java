package com.imortaweb.curso1.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imortaweb.curso1.entities.Person;

public interface UserRepository extends JpaRepository<Person, Long>{

}
