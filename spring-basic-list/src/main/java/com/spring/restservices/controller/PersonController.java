package com.spring.restservices.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restservices.model.Person;
import com.spring.restservices.service.PersonService;

@RestController
public class PersonController {

	PersonService personService = new PersonService();
	
	
	@GetMapping("/persons")
	public List<Person> getAllPersons(){
	
		return personService.getAllPersons();
	}
}
