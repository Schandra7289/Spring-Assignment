package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.constructor.Showroom;
import com.spring.constructor.Vehicle;
import com.spring.setter.Employee;
import com.spring.setter.StudentDetails;

public class DependencyMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring");
		Employee employee= context.getBean("employee", Employee.class);
		employee.printDetails();

		System.out.println();
		
		StudentDetails details = context.getBean("studentDetails", StudentDetails.class);
		details.showCourse("database").forEach(System.out::println);
		
		System.out.println();
		
		Vehicle vehicle =context.getBean("vehicle" , Vehicle.class);
		vehicle.showInsurance();
		
		System.out.println();
		Showroom showroom= context.getBean("showroom", Showroom.class);
		showroom.showBrands().forEach(System.out::println);
	}
}
