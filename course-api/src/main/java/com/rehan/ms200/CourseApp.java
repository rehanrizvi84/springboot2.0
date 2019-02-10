/**
 * 
 */
package com.rehan.ms200;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Mohammad Rehan Rivi
 *
 */
@SpringBootApplication
@ComponentScan("com.rehan")
public class CourseApp {

	/**
	 * 
	 */
	public CourseApp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CourseApp.class, args);
	}

}
