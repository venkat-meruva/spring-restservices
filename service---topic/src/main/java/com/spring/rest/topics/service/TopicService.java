package com.spring.rest.topics.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.rest.topics.model.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("123", "Spring Framework", "Spring Boot"),
			new Topic("456", "Core Java", "Advance Java"), new Topic("789", "Spring", "Angualr 4")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}

	public void addTopic(Topic topic) {
		topics.add(topic);

	}

	public void updateTopic(Topic topic, String id) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);

			}
		}

	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}

}