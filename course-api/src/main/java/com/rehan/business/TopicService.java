package com.rehan.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	public TopicService() {
		// TODO Auto-generated constructor stub
	}
	
	 @Autowired 
	 private TopicRepository topicRepository;
	 
	 List<Topic> topicList = new ArrayList<Topic>();
	
	public List<Topic> getTopics() {
		// return topiclist;
		
		 topicRepository.findAll().forEach(topicList::add);
		return topicList;
	}

	public Topic getTopicById(int id) {

		//Topic topic = topicList.stream().filter(t -> t.getId() == id).findFirst().get();
		Topic topic =topicRepository.findById(id).get();
		return topic;
	}

	public void addTopic(Topic topic) {
		
		//topiclist.add(topic);
		 topicRepository.save(topic);
	}

	public void updateTopics(int id, Topic topic) {
		topicRepository.save(topic);
		/*
		 * for (Topic t : topicList) {
		 * 
		 * if (t.getId() == id) { topicList.set(t.getId(), topic); break; } }
		 */
	}

	public void deleteTopics(int id) {
		Topic t = new Topic();
		t.setId(id);		
		topicRepository.delete(t);
		//topicList.removeIf(t -> t.getId() == id);
	}

}
