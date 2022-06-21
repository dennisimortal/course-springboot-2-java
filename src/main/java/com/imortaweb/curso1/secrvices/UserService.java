package com.imortaweb.curso1.secrvices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imortaweb.curso1.entities.Person;
import com.imortaweb.curso1.repositores.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
		
	public List<Person> findAll(){
		return  repository.findAll();
	}
	
	public Person findById(Long id) {
	  Optional<Person> obj = repository.findById(id);
	  return obj.get();
	}
	
	public Person insert(Person obj) {
		return repository.save(obj);
	}
	
}
