package com.spring.auto3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarFactory {
	
	@Autowired
	@Qualifier("convertible")
	private ICar icar;
	
	@Autowired
	private ICar sedean;

	
	private ICar car;

	public CarFactory(@Qualifier("hatchBack") ICar car) {
		super();
		this.car = car;
	}

	public List<String> checkBrands(String choice){
		if(choice.equals("c"))
			return icar.showBrands();
		if(choice.equals("s"))
			return sedean.showBrands();
		if(choice.equals("h"))
			return car.showBrands();
		
		return null;
	}
}
