package org.home.mazi.sampledockerbuildspringboot.service;

import lombok.AllArgsConstructor;
import org.home.mazi.sampledockerbuildspringboot.model.PersonEntity;
import org.home.mazi.sampledockerbuildspringboot.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonServiceImpl {

	private PersonRepository repository;

	public List<PersonEntity> getAll() {
		return repository.findAll();
	}
}
