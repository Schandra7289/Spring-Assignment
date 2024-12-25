package com.spring.setter;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Course {

	public List<String> getAll(String type){
		if(type.equals("frontend")) {
			return Arrays.asList("Html","Css", "Angular","React");
		}
		if(type.equals("backend")) {
			return Arrays.asList("Java", "Springboot","Microiservices");
			
		}
		if(type.equals("database")) {
			return Arrays.asList("Mysql", "MangoDB","Oracle");
		}
		
		else {
			return Arrays.asList("No Courses Availble");
		}
	}
}
