package com.skillstorm.project1.adventure;

import java.util.Scanner;

import com.skillstorm.Project.Rogue;
import com.skillstorm.Project.Warrior;

public class Game {
    private Player player;

    public void start() {
        System.out.println("Welcome to the Text Adventure Game!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        player = chooseClass();

        System.out.println("Welcome, " + name + " the " + player.getClassName() + "!");
        System.out.println("Your stats: Strength=" + player.getStrength() + " Agility=" + player.getAgility() +
                " Luck=" + player.getLuck());

        // TODO: Implement game logic
    }

    private Player chooseClass() {
        System.out.println("Please choose your class:");
        System.out.println("1. Warrior");
        System.out.println("2. Rogue");
        System.out.println("3. Archer");

        Scanner scanner = new Scanner(System.in);
        int classChoice = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        switch (classChoice) {
            case 1:
                return new Warrior();
            case 2:
                return new Rogue();
            case 3:
                return new Archer();
            default:
                System.out.println("Invalid choice. Please try again.");
                return chooseClass();
        }
    }
}
