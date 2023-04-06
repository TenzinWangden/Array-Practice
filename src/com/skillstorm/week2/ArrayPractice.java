package com.skillstorm.week2;

import java.util.Scanner;

public class ArrayPractice {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What are your 3 favrite food? ");
		String[] userFood = new String[3];
		userFood[0] = in.next();
		userFood[1] = in.next();
		userFood[2] = in.next();
		System.out.println("Cool your favirote food are " + userFood[0] + ", " + userFood[1] + ", " + userFood[2]+"!");
		String[] numbers = {"apple", "orange", "watermelon" };
		System.out.println(numbers[0]);
	}

}
