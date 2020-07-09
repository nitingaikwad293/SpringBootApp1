package com.javahack.springboot.controller.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.javahack.springboot.model.Topic;

@Service
public class TopicService {
	
	
	private static List<Topic> topices = new ArrayList<Topic> (Arrays.asList(
			new Topic("T101", "Java"),
			new Topic("T102", "Spring"),
			new Topic("T102", "Maths")
			));
	
	
	public List<Topic> getAllTopic(){
		return topices;
	}
	
	public Topic getTopic(String id) {
		
		return topices.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topices.add(topic);
		
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
