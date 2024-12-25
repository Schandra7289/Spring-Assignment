package com.spring.auto4;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Thriller implements IMovie {

	@Override
	public List<String> printMovies(String language) {
		
		if(language.equals("Telugu"))
			return Arrays.asList("Dhruva","Lucky Bhaskar","Julyi");
		if(language.equals("Tamil"))
			return Arrays.asList("Adhrindi","Jailer","Kabili");
		if(language.equals("English"))
			return Arrays.asList("se7en","Shutter Island","The Sixth Sense");
		
		return Arrays.asList("No movies");
		
	}

}
