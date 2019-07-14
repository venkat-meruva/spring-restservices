package com.mvr.services.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {

	
	@Autowired
	JdbcTemplate jdbcTemplate; 
	
	@RequestMapping("/insert")
	public String index() {
		
		jdbcTemplate.execute("insert into contact(contact_id,name,email,address,telephone)values('123','Venkat','venkatmeruvaa@gmail.com','Charlotte','9105146042')");
		return "Data was successfully inserted";
	}
}
	