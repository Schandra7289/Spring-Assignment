package com.spring.setter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")

public class StudentDetails {

	@Value("${student.studentName}")
	private String studentName;
	@Value("${student.studentId}")
	private Integer studentId;

	@Autowired
	private Course course;

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<String> showCourse(String type) {
		System.out.println("Showing Courses for:" + type);
		return course.getAll(type);

	}
}
