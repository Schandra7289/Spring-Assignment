package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {

	@Autowired
	@Qualifier("square")
	private IShape shape;

	public void setShape(IShape shape) {
		this.shape = shape;
	}

	@Autowired
	private IShape rectangle;
	
	private IShape myshape;
	
	public ShapeFactory(@Qualifier("triangle") IShape myshape) {
		super();
		this.myshape = myshape;
	}

	public void printArea(String choice, double x, double y) {

		/*
		 * shape = new Rectangle(); shape.area(10, 20);
		 * 
		 * shape = new Square(); shape.area(10, 20);
		 * 
		 * 
		 * shape = new Triangle(); shape.area(10, 20);
		 */
		if(choice.equals("s"))
		shape.area(x, y);
		if(choice.equals("r"))
		rectangle.area(x, y);
		if(choice.equals("t"))
		myshape.area(x, y);
	}
}
