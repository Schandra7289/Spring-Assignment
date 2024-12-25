package com.spring.auto5;

import org.springframework.stereotype.Component;

@Component
public class Web implements IGames{

	@Override
	public void gamesPlayed() {
		
		System.out.println("Playing Pubg");
	}

}
