package com.skillstorm.project1.adventure;

public class CharacterClass {
	int stringth;
	int defence;
	int hp;
	int acc;
	String rouge() {
		stringth = 5;
		defence = 3;
		hp = 5;
		acc = 7;
		return null;
	}
	String tank() {
		stringth = 10;
		defence = 10;
		hp = 10;
		acc = 3;
		return null;
	}
	String archer() {
		stringth = 8;
		defence = 3;
		hp = 7;
		acc = 10;
		return null;
	}

}
