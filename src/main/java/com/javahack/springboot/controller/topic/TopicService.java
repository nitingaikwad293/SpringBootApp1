package com.javahack.springboot.controller.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.javahack.springboot.model.Topic;

@Service
public class TopicService {
	
	
	private static List<Topic> topices = Arrays.asList(
			new Topic("T101", "Java"),
			new Topic("T102", "Spring"),
			new Topic("T102", "Maths")
			);
	
	
	public List<Topic> getAllTopic(){
		return topices;
	}
	
	public Topic getTopic(String id) {
		
		return topices.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

}
