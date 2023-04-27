package com.skillstorm.project1.adventure;

import java.util.Scanner;

public class Game {
	private Player player;
	private int currentRoom;
	private String[] rooms;
	private String[] monsters;

	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}

	public void start() {
		System.out.println("Welcome to the Text Adventure Game!");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = scanner.nextLine();

		player = chooseClass(name);

		System.out.println("Welcome, " + player.getName() + " the " + player.getClassName() + "!");
		System.out.println("Your stats: Strength=" + player.getStrength() + " Agility=" + player.getAgility()
				+ "\nYou are very fast but lack the aptitute to fight.");

		// Initialize the rooms and monsters
		rooms = new String[] { "living room", "kitchen", "bathroom", "bedroom", "attic", "basement", "garage", "office",
				"library" };
		monsters = new String[] { "zombie", "vampire", "werewolf", "witch", "ghost", "goblin", "dragon", "demon",
				"skeleton" };

		// Start the game loop
		while (true) {
			System.out.println("\nYou are currently in the " + rooms[currentRoom] + ".");
			System.out.println("There is a " + monsters[currentRoom] + " in the room.");
			System.out.println("What would you like to do?");
			System.out.println("1. Fight");
			System.out.println("2. Run");

			int choice = scanner.nextInt();
			scanner.nextLine(); // consume the newline character

			if (player instanceof Player.Warrior) {
				if (choice == 1) {
					System.out.println("You have defeated the " + monsters[currentRoom] + "!");
					currentRoom++;
				} else {
					System.out.println("You tried to run away but you are too slow. " + monsters
							+ " cought up to you and killed you!");
					gameOver(scanner);
					break;
				}
			} else if (player instanceof Player.Rogue) {
				if (choice == 1) {
					System.out.println(
							"You bravely try to fight but having no strength " + monsters + " attecked you and died!");
					gameOver(scanner);
					break;
				} else {
					System.out.println("You have successfully run away from the " + monsters[currentRoom] + ".");
					currentRoom++;
				}
			}
			if (currentRoom == rooms.length) {
				System.out.println("You have won the game!");
				gameOver(scanner);
				break;
			}
		}
	}

	private Player chooseClass(String name) {
		System.out.println("Please choose your class:");
		System.out.println("1. Warrior");
		System.out.println("2. Rogue");

		Scanner scanner = new Scanner(System.in);
		int classChoice = scanner.nextInt();
		scanner.nextLine(); // consume the newline character

		switch (classChoice) {
		case 1:
			int strength = 10;
			return new Player.Warrior(name, strength);
		case 2:
			int agility = 10;
			return new Player.Rogue(name, agility);
		default:
			System.out.println("Invalid choice. Please try again.");
			return chooseClass(name);
		}
	}

	private void gameOver(Scanner scanner) {
		System.out.println("Game over. Would you like to play again? (y/n)");
		String choice = scanner.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			currentRoom = 0;
			start();
		} else {
			System.exit(0);
		}
	}
}
