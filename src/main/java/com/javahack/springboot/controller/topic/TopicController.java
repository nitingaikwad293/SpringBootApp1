package com.javahack.springboot.controller.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javahack.springboot.model.Topic;

@RestController
public class TopicController {
	
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopic(){
		
		
		List<Topic> topices = new ArrayList<Topic>();
		
		topices.add(new Topic("T101", "Java"));
		topices.add(new Topic("T102", "Spring"));
		
		return topices;
		
	}
	

}
