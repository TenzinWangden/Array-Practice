package com.skillstorm.week3.GroupWork;
/*
 * Team Catchable
   Daun
   Blake
   Tenzin
 */

public class ProgramerMain {
	public static void main(String[] args) {
		Programer a = new Programer();
		
		
		a.addLanguage("C++");
		a.addLanguage("Pythoin");
		a.addLanguage("Jva");
		a.addLanguage("C#");
		a.addLanguage("Stack");
		System.out.println("Test 1: " + a);
		
		
//		a.addLanguage("C++");
//		a.addLanguage("Pythoin");
//		a.addLanguage("Jva");
//		a.addLanguage("C#");
//		a.addLanguage("Stack");
//		a.addLanguage("Stack");
//		a.removeLanguage("C++");
		System.out.println("remove Test: " + a);

	}
}
