package com.spring.auto3;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class HatchBack extends ICar {

	@Override
	List<String> showBrands() {
		return Arrays.asList("Maruti Swift", "Maruti Baleno", "Maruti Wagon R");
	}

}
