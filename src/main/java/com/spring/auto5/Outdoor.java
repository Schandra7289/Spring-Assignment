package com.spring.auto5;

import org.springframework.stereotype.Component;

@Component
public class Outdoor implements IGames{

	@Override
	public void gamesPlayed() {
		
		System.out.println("Playing Cricket");
	}

}
