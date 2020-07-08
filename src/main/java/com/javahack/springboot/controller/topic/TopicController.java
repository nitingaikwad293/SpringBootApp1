package com.javahack.springboot.controller.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javahack.springboot.model.Topic;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping("/topices")
	public List<Topic> getAllTopic(){
		return 	topicService.getAllTopic();
	}
	
	@RequestMapping("/topices/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}

}
