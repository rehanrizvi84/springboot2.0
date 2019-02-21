package com.rehan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rehan.business.Topic;
import com.rehan.business.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	public TopicController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/topics")
	public List<Topic> listTopics() {
		System.out.println("Get Topics called");
		List<Topic> topicList = topicService.getTopics();
		return topicList;
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable int id) {

		return topicService.getTopicById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {

		System.out.println(topic.getName());
		topicService.addTopic(topic);
	}
	@RequestMapping(method= RequestMethod.PUT, value ="/topics/{id}" )
	public void doUpdate(@PathVariable int id, @RequestBody Topic topic) {
		
		topicService.updateTopics(id, topic);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value= ("/topics/{id}"))
	public void doDelete(@PathVariable int id) {
		
		topicService.deleteTopics(id);
		
	}
	
	
}
