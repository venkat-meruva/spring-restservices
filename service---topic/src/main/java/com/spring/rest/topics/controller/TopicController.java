package com.spring.rest.topics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.topics.model.Topic;
import com.spring.rest.topics.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	TopicService topicservice;

	@GetMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicservice.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicservice.getTopic(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topic")
	public String addTopic(@RequestBody Topic topic) {
		topicservice.addTopic(topic);
		return "Added one more";
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public String updateTopic(@RequestBody Topic topic, String id) {
		topicservice.updateTopic(topic, id);
		return "updated";

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public String deteleTopic(@PathVariable String id) {
		topicservice.deleteTopic(id);
		return "deleted";
	}
}
