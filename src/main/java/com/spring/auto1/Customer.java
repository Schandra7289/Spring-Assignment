package com.spring.auto1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Customer {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.auto1");
		Restaurant restaurant = context.getBean("restaurant", Restaurant.class);

		restaurant.allItems("in").forEach(System.out::println);
		System.out.println();
		restaurant.allItems("c").forEach(System.out::println);
		System.out.println();
		restaurant.allItems("it").forEach(System.out::println);
		System.out.println();
	}

}
