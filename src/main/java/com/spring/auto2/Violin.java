package com.spring.auto2;

import org.springframework.stereotype.Component;

@Component
public class Violin implements Instrument {

	@Override
	public void playSong(String song ) {

		System.out.println("playing this" + song + "using Violin");
	}

}
