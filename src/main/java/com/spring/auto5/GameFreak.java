package com.spring.auto5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameFreak {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.auto5");
		GamesArena gamesArena=context.getBean("gamesArena", GamesArena.class);
		gamesArena.showGames("i", "Indoor");
		gamesArena.showGames("o", "Outdoor");
		gamesArena.showGames("w", "Web");
	}

}
