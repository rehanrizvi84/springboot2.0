package com.rehan.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	public TopicService() {
		// TODO Auto-generated constructor stub
	}

	private List<Topic> topiclist = new ArrayList<Topic>(
			Arrays.asList(new Topic(1, "Maths", "Level1"), new Topic(2, "Java", "Java 8"),
					new Topic(3, "Physics", "Rocket Science"), new Topic(4, "Spring", "Spring Boot")));

	public List<Topic> getTopics() {
		return topiclist;
	}

	public Topic getTopicById(int id) {

		Topic topic = topiclist.stream().filter(t -> t.getId() == id).findFirst().get();
		return topic;
	}

	public void addTopic(Topic topic) {

		topiclist.add(topic);
	}

	
	public void updateTopics(int id, Topic topic) {
		
		for(Topic t: topiclist) {
			
			if(t.getId()==id) {
				topiclist.set(t.getId(),topic);
				break;
			}
		}
		
		
	}

	public void deleteTopics(int id) {
		
		topiclist.removeIf(t-> t.getId()== id);
	}

}
