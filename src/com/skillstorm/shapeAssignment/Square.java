package com.skillstorm.shapeAssignment;

public class Square extends Shape{
	int sideLength;
	public Square() {
		super(4);
		this.sideLength = 1;
	}
	public Square(int sideLength) {
		super(4);
		this.sideLength=sideLength;
	}
	
	public static void main(String[] args) {
		
		Shape Squre = new Shape();
		Squre.ammountOfSides(4);
		System.out.println("Squre has " + Squre.ammountOfSides() + " sides");
		
		// You can add more shapes down here
	}
	@Override
	public String toString() {
		return "This shape has " + ammountOfSides + " sides";
	}
}
