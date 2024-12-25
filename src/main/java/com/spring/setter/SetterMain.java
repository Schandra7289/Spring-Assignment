package com.spring.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.setter");
		Mobile mobile = context.getBean("mobile",Mobile.class);
		mobile.printDetails();
	}

}
