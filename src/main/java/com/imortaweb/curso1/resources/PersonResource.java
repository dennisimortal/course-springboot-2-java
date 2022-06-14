package com.imortaweb.curso1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imortaweb.curso1.entities.Person;

@RestController
@RequestMapping(value = "/persons")
public class PersonResource {

	@GetMapping
	public ResponseEntity<Person> findAll(){
		Person u = new Person(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
				
	}
}
