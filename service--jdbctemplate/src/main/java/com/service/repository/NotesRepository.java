package com.service.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NotesRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<String> getAllContect() {
		List<String> ContentList = new ArrayList<>();
		ContentList.addAll(jdbcTemplate.queryForList("select content from sys.notes", String.class));
		return ContentList;
	}

}
