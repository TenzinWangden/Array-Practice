package com.skillstorm.week3.GroupWork;
/*
 * Team Catchable
   Daun
   Blake
   Tenzin
 */
import java.util.Arrays;

public class Programer {
	private static final int MAX_CAPACITY = 10;
	private String[] language = new String[MAX_CAPACITY];
	private int numLanguageLearned;
	private String name;
	private String company;
	

	public void addLanguage(String language) {

		this.language[this.numLanguageLearned] = language;
		this.numLanguageLearned ++;
	}

	public void removeLanguage(String language) {

		this.language[this.numLanguageLearned] = language;
		this.numLanguageLearned --;
	}

	public Programer() {
	}

	public Programer(String name, String company) {
		this.name = name;
		this.company = company;
	}
// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		String result = "";
		// Include the name
		result += "Name: " + this.name + "\n";
		// Include the address
		result += "company: " + this.company + "\n";
		// Include a list of the flavors in stock
		result += this.numLanguageLearned + " Language learned: \n";
		for (int i = 0; i < this.numLanguageLearned; i++) {
			result += this.language[i] + ", ";
		}
		result = result.substring(0, result.length() - 2);
		return result;
	}
//	try {
//		System.out.println(divide(1, 0));
//	} catch (ArithmeticException e) {
//		System.out.println("catch statement running from divide");
//	}
}