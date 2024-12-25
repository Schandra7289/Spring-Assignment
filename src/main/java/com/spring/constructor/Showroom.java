package com.spring.constructor;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Showroom {

	private Car car;
	
	public Showroom(Car car) {
		super();
		this.car = car;
	}

	public List<String> showBrands(){
		return car.getAllBrands();
	}
}
