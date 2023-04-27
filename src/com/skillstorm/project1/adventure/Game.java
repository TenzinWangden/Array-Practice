package com.skillstorm.project1.adventure;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Dungeon Adventure!");
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Choose your class: (1) Warrior or (2) Rogue");
		int classChoice = input.nextInt();
		Player player;
		if (classChoice == 1) {
			System.out.println("You have chosen to be a Warrior!");
			System.out.print("Enter your strength: ");
			int strength = input.nextInt();
			player = new Player.Warrior(name, strength);
		} else {
			System.out.println("You have chosen to be a Rogue!");
			System.out.print("Enter your agility: ");
			int agility = input.nextInt();
			player = new Player.Rogue(name, agility);
		}
		System.out.println("Welcome, " + player.getName() + " the " + player.getClassName() + "!");
		if (player.getClassName().equals("Warrior")) {
			System.out.println("Your stats: Strength=" + player.getStrength() + " Agility=" + player.getAgility()
					+ "\nYou are very Strong but slow as a turtle.");
		} else {
			System.out.println("Your stats: Strength=" + player.getStrength() + " Agility=" + player.getAgility()
					+ "\nYou are very fast but lack the aptitude to fight.");
		}
		System.out.println("You have entered the dungeon.");
		Room entrance = new Room("Entrance");
		Room monsterRoom = new Room("Monster Room");
		Room treasureRoom = new Room("Treasure Room");
		 // Set exits from entrance room
	    entrance.setExit("north", monsterRoom);
	    entrance.setExit("south", treasureRoom);
	    // Set exits from monster room
	    monsterRoom.setExit("south", entrance);
	    // Set exits from treasure room
	    treasureRoom.setExit("north", entrance);
		
		Room currentRoom = entrance;
		boolean gameEnd = false;
		while (!gameEnd) {
			System.out.println("You are currently in the " + currentRoom.getName());
			System.out.print("Where would you like to go? (north, south): ");
			String direction = input.nextLine();
			currentRoom = currentRoom.getExit(direction);
			if (currentRoom == monsterRoom) {
				System.out.println("You have entered the monster room. Prepare for battle!");
				// Implement battle logic here
				System.out.println("You have defeated the monster and gained access to the treasure room.");
			} else if (currentRoom == treasureRoom) {
				System.out.println("Congratulations! You have found the treasure room and won the game!");
				gameEnd = true;
			}
		}
		System.out.println("Thanks for playing!");
	}
}
