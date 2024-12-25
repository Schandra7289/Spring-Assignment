package com.spring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Mobile {

	@Value("${mobile.model}")
	private String model;
	@Value("${mobile.brand}")
	private String brand;
	@Value("${mobile.price}")
	private Double price;
	
	@Autowired
	private Features features;

	public void setMobile(String model) {
		this.model = model;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setFeatures(Features features) {
		this.features = features;
	}

	public void printDetails() {
		System.out.println("model:" + model);
		System.out.println("brand:" + brand);
		System.out.println("price:" + price);

		String colour = features.getColour();
		System.out.println("colour:" + colour);

		System.out.println("os:" + features.getOs());

		System.out.println("memory:" + features.getMemory());
	}
}
