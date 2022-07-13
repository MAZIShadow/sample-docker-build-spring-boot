package org.home.mazi.sampledockerbuildspringboot.controller;

import lombok.AllArgsConstructor;
import org.home.mazi.sampledockerbuildspringboot.model.PersonEntity;
import org.home.mazi.sampledockerbuildspringboot.service.PersonServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class HelloController {

	private PersonServiceImpl personService;

	@GetMapping("/")
	public String get(@RequestParam(defaultValue = "lord") String name) {
		return "Hello, " + name;
	}

	@GetMapping("/all")
	public String getAll() {
		return personService.getAll().stream()
				.map(PersonEntity::getFirstName)
				.collect(Collectors.joining());
	}
}
