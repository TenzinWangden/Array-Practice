package com.skillstorm.shapeAssignment;

public class Tester {
	public static void main(String[] args) {
		Shape triangle = new Triangle();
		triangle.ammountOfSides();
		double area = ((Triangle) triangle).calculateArea();
		
		System.out.println("Trigngle has " + triangle.ammountOfSides() + " sides" + "Area is "+ area);
		Shape square = new Square();
		square.ammountOfSides();
		System.out.println("Square has " + square.ammountOfSides() + " sides");

		// You can add more shapes down here
	}
}
