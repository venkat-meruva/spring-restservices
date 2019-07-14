package com.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.repository.NotesRepository;

@RestController
@RequestMapping("/app")
public class NotesController {

	@Autowired
	NotesRepository notesRepository; 
	
	@GetMapping("/notes")
	public List<String> getAll(){
		return notesRepository.getAllContect();
	}
}
