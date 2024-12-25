package com.spring.auto4;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Horror implements IMovie {

	@Override
	public List<String> printMovies(String language) {
		
		if(language.equals("Telugu"))
			return Arrays.asList("Ganga","Boomi","Avunu");
		if(language.equals("Tamil"))
			return Arrays.asList("Kanchana","Muni","Aranmani");
		if(language.equals("English"))
			return Arrays.asList("Tricked","Nun","Get Out");
		
		return Arrays.asList("No movies");
	}

}
