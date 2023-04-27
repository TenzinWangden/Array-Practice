package com.skillstorm.project1.adventure;

import java.util.Scanner;

public class Game {
    private Player player;

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
        System.out.println("Your stats: Strength=" + player.getStrength() + " Agility=" + player.getAgility());
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
//                System.out.print("Enter strength: ");
                int strength = 10;
//                scanner.nextLine(); // consume the newline character
                return new Player.Warrior(name, strength);
            case 2:
//                System.out.print("Enter agility: ");
                int agility = 10;
//                scanner.nextLine(); // consume the newline character
                return new Player.Rogue(name, agility);
            default:
                System.out.println("Invalid choice. Please try again.");
                return chooseClass(name);
        }
    }
}
