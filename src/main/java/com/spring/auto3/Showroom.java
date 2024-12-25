package com.spring.auto3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Showroom {

	public static void main(String[] args) {

		ApplicationContext context= new AnnotationConfigApplicationContext("com.spring.auto3");
		CarFactory carFactory = context.getBean("carFactory",CarFactory.class);
		carFactory.checkBrands("c").forEach(System.out::println);
		System.out.println();
		carFactory.checkBrands("s").forEach(System.out::println);
		System.out.println();
		carFactory.checkBrands("h").forEach(System.out::println);
		System.out.println();
	}

}
