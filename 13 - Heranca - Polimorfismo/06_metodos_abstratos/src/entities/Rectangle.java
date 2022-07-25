package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
	
	private Double height;
	private Double width;
	
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.height = height;
		this.width = width;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
	

}
