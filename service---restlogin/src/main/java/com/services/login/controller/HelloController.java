package com.services.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/display")
	public String Display() {
		return "Welcome with high security";
	}
}
