package com.spring.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	@Value("${vehicle.model}")
	private String model;
	@Value("${vehicle.brand}")
	private String brand;
	private Insurance insurance;
	public Vehicle(Insurance insurance) {
		super();
		this.insurance = insurance;
	}
	
	public void showInsurance() {
		System.out.println("Printing Insurnace For Vehicles");
		System.out.println(insurance.getType());
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
