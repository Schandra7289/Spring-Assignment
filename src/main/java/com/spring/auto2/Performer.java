package com.spring.auto2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {

	@Autowired
	@Qualifier("guitar")
	private Instrument instrument;

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Autowired
	private Instrument violin;

	private Instrument music;

	public Performer(@Qualifier("keyboard") Instrument music) {
		super();
		this.music = music;
	}

	public void bandMusic(String choice,String song, String type) {
		if(choice.equals("g"))
			 instrument.playSong(song);
		if(choice.equals("v"))
			violin.playSong(song);
		if(choice.equals("k"))
			music.playSong(song);
	}
}
