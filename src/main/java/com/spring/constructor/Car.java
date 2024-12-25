package com.spring.constructor;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	public List<String> getAllBrands(){
		return List.of("Audi", "Kia","BMW","Honda");
	}

}
