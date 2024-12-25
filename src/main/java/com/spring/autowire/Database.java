package com.spring.autowire;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Database extends CourseDetails {

	@Override
	List<String> getAllCourses() {
		return Arrays.asList("MYSql", "MangoDB","Oracle");
	}

} 
