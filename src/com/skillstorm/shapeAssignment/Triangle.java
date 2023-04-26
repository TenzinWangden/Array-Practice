package com.skillstorm.shapeAssignment;

public class Triangle extends Shape {
	private double sideLength;
	private double sideHeight;
	public Triangle() {
		super(3);
		this.sideLength = 3;
		this.sideHeight = 5;
	}
	public double calculateArea() {
		return((1.0/2.0)  * sideLength * sideHeight);
	}
	
//	public static void main(String[] args) {
//		Shape triangle = new Shape();
//		triangle.ammountOfSides();
//		System.out.println("Trigngle has " + triangle.ammountOfSides() + " sides");
		
		
		// You can add more shapes down here
//	}
@Override
public String toString() {
	return "This shape has " + ammountOfSides + " sides";
}
}
