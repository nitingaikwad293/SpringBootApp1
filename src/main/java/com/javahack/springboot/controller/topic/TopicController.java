package com.javahack.springboot.controller.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(method = RequestMethod.POST,value = "/topices")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT,value = "/topices/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		topicService.updateTopic(id,topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/topices/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}

}
