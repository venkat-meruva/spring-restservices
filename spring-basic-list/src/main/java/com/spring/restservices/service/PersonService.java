package com.spring.restservices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.restservices.model.Person;

@Service
public class PersonService {

	public List<Person> getAllPersons() {
		Person p1 = new Person(101, "Venkat", 1000);
		Person p2 = new Person(102, "Meruva", 2000);
		Person p3 = new Person(103, "Rao", 3000);

		List<Person> p = new ArrayList<Person>();

		p.add(p1);
		p.add(p2);
		p.add(p3);

		return p;
		
	}
}
