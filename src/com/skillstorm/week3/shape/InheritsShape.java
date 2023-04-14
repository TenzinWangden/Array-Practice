package com.skillstorm.week3.shape;

public class InheritsShape extends Shape{
	
	public static void main(String[] args) {
		Shape triangle = new Shape();
		triangle.ammountOfSides();
		System.out.println("Trigngle has " + triangle.ammountOfSides() + " sides");
		
		Shape Squre = new Shape();
		Squre.ammountOfSides(4);
		System.out.println("Squre has " + Squre.ammountOfSides() + " sides");
		
		// You can add more shapes down here
	}

}
