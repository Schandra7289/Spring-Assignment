package com.spring.auto4;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Theater {

	@Autowired
	@Qualifier("thriller")
	private IMovie imovie;

	@Autowired
	private IMovie drama;

	private IMovie movie;

	public Theater(@Qualifier("horror") IMovie movie) {
		super();
		this.movie = movie;
	}

	public List<String> moviesRunning(String choice, String language) {

		if (choice.equals("t"))
			return imovie.printMovies(language);

		if (choice.equals("d"))
			return drama.printMovies(language);

		if (choice.equals("h"))
			return movie.printMovies(language);

		return Arrays.asList("No Movies");

	}
}
