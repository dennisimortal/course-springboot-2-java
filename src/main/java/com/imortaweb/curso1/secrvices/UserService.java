package com.imortaweb.curso1.secrvices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.imortaweb.curso1.entities.Person;
import com.imortaweb.curso1.repositores.UserRepository;
import com.imortaweb.curso1.secrvices.exceptions.DatabaseException;
import com.imortaweb.curso1.secrvices.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<Person> findAll() {
		return repository.findAll();
	}

	public Person findById(Long id) {
		Optional<Person> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public Person insert(Person obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());

		}
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
