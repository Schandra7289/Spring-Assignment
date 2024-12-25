package com.spring.auto1;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Chinese implements IMenu {

	@Override
	public List<String> itemsAvailable() {
		return Arrays.asList("Noddeless", "Fried Rice","Maggie");
	}

}
