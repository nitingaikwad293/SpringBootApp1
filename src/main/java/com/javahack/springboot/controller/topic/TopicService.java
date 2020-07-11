package com.javahack.springboot.controller.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javahack.springboot.model.Topic;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;
	
	List<Topic> topices = new ArrayList<>();
	
	public List<Topic> getAllTopic(){
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		
		return new Topic();
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
//		topices.add(topic);
		
	}

	public void updateTopic(String id, Topic topic) {

		for(int i =0;i<=topices.size();i++) {
			
			Topic oldTopic = topices.get(i);
			
			if(oldTopic.getId().equals(id)) {
				topices.set(i, topic);
				return;
			}
			
		}
		
	}

	public void deleteTopic(String id) {
		topices.removeIf(t->t.getId().equals(id));
	}

}
