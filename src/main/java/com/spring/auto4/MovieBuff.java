package com.spring.auto4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MovieBuff {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.auto4");

		Theater theater = context.getBean("theater", Theater.class);

		theater.moviesRunning("t", "Telugu").forEach(System.out::println);

		System.out.println();

		theater.moviesRunning("d", "Telugu").forEach(System.out::println);

		System.out.println();

		theater.moviesRunning("h", "Telugu").forEach(System.out::println);

		System.out.println();
		
		theater.moviesRunning("t", "Tamil").forEach(System.out::println);

		System.out.println();

		theater.moviesRunning("d", "Tamil").forEach(System.out::println);

		System.out.println();

		theater.moviesRunning("h", "Tamil").forEach(System.out::println);

		System.out.println();
		theater.moviesRunning("t", "English").forEach(System.out::println);

		System.out.println();

		theater.moviesRunning("d", "English").forEach(System.out::println);

		System.out.println();

		theater.moviesRunning("h", "English").forEach(System.out::println);

		System.out.println();

	}

}
