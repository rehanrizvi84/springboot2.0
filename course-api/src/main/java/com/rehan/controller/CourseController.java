package com.rehan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CourseController {
	
	public CourseController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/hello")
	public String  sayHello() {
		System.out.println("Hello called");
		return "Hello boot";
	}
	
	
}

