package com.skillstorm.week2;

public class FindTheMaxValueOfNAnArray {
	public static void main(String[] args) {
		int[] myNumbers = { 14, 51, -31, 14, 51 };
		int[] oneNumbers = { 14 };
		nullNumbers(new int[] {});
		int smallest = myNumbers[0];
		int largest = myNumbers[0];

		findMax(myNumbers);
		findOneIndex(oneNumbers);
		nullNumbers(null);
	}

	public static void findMax(int[] myNumbers) {
		if (myNumbers == null)
			myNumbers = new int[0];
		int i = 0;
		int smallest = myNumbers[0];
		int largest = myNumbers[0];
		while (i < myNumbers.length) {
			if (myNumbers[i] < smallest)
				smallest = myNumbers[i];
			if (myNumbers[i] > largest)
				largest = myNumbers[i];
			i++;
		}
		System.out.println("the smallest is: " + smallest);
		System.out.println("the largest is: " + largest);
	}

	public static void findOneIndex(int[] oneNumbers) {
		int i = 0;
		int smallest = oneNumbers[0];
		int largest = oneNumbers[0];
		while (i < oneNumbers.length) {
			if (oneNumbers[i] < smallest)
				smallest = oneNumbers[i];
			if (oneNumbers[i] > largest)
				largest = oneNumbers[i];
			i++;
		}
//		System.out.println("the smallest number in one index array is: " + smallest);
//		System.out.println("the largest number in one index array is: " + largest);
	}

	public static void nullNumbers(int[] numbers) {
		if (numbers == null) {
			System.out.print("numbers cannot be null");
		}
	}
}
