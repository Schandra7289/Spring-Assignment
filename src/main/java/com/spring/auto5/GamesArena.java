package com.spring.auto5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GamesArena {

	@Autowired
	@Qualifier("indoor")
	private IGames igames;

	@Autowired
	private IGames outdoor;

	private IGames games;

	public GamesArena(@Qualifier("web") IGames games) {
		super();
		this.games = games;
	}

	public void showGames(String choice, String type) {

		if (choice.equals("i"))

			igames.gamesPlayed();
		if (choice.equals("o"))

			outdoor.gamesPlayed();
		if (choice.equals("w"))

			games.gamesPlayed();
	}
}
