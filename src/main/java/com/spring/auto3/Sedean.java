package com.spring.auto3;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Sedean extends ICar {

	@Override
	List<String> showBrands() {
		return Arrays.asList("Maruti Dezire", "Honda Amaze", "Verna");
	}

}
