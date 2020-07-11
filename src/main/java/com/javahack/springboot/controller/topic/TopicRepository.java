package com.javahack.springboot.controller.topic;

import org.springframework.data.repository.CrudRepository;

import com.javahack.springboot.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
	

}
