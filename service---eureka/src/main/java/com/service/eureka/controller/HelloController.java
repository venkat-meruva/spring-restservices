package com.service.eureka.controller;

/**
 * Rest end point with display running in eureka 
 * server port no : 8761
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/display")
	public String display() {
		return "welcome to spring eureka ";
	}
}
