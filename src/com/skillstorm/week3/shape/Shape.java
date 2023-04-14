package com.skillstorm.week3.shape;

public class Shape {
	private int ammountOfSides;
	
	public Shape() {
		this.ammountOfSides = 3;
	}
	
	public Shape(int ammountOfSides) {
		this.ammountOfSides = ammountOfSides;
	}
	
	public int ammountOfSides() {
		return ammountOfSides;
	}
	
	public void ammountOfSides(int ammountOfSides) {
		this.ammountOfSides = ammountOfSides;
	}
	
	@Override
	public String toString() {
		return "This shape has " + ammountOfSides + " sides";
	}
}
