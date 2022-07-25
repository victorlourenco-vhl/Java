package entities;

import entities.enums.Color;

public class Circle extends Shape{
	
	private Double radius;
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(radius, 2) * Math.PI;
	}
	
	
	
}
