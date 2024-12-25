package com.spring.auto4;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Drama implements IMovie {

	@Override
	public List<String> printMovies(String language) {
		
		if(language.equals("Telugu"))
			return Arrays.asList("Rangasthalam","Puspa","Jalsa");
		if(language.equals("Tamil"))
			return Arrays.asList("Goat","Wisel","24");
		if(language.equals("English"))
			return Arrays.asList("Gran Torino","The Green Mile","Dog Day Afternoon");
		
		return Arrays.asList("no movies");
		
	}

}
