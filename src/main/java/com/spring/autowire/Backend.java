package com.spring.autowire;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Backend extends CourseDetails {

	@Override
	List<String> getAllCourses() {
		return Arrays.asList("Java", "SpringBoot","Microservices");
	}

} 
