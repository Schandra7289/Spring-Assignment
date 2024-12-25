package com.spring.auto2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MusicLover {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.auto2");
		Performer performer = context.getBean("performer", Performer.class);

		performer.bandMusic("g", "Heart Beat", "Guitar");
		performer.bandMusic("v", "Love", "Violin");
		performer.bandMusic("k", "Mass", "KeyBoard");
	}

}
