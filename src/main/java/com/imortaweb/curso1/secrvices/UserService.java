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

	public List<Person> findAll() {
		return repository.findAll();
	}

	public Person findById(Long id) {
		Optional<Person> obj = repository.findById(id);
		return obj.get();
	}

	public Person insert(Person obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	@SuppressWarnings("deprecation")
	public Person update(Long id, Person obj) {
		Person entity = repository.getOne(id);
		updadeData(entity, obj);
		return repository.save(entity);
	}

	private void updadeData(Person entity, Person obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());

	}
}
