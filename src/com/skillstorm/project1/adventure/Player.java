package com.skillstorm.project;

import java.util.Scanner;

public class Player {
    private String name;
    private int health;
    private int attack;

    public Player(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public void attack(Monster monster) {
        System.out.println("You attack the " + monster.getName() + " with " + this.getAttack() + " attack points.");
        monster.takeDamage(this.getAttack());
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (!isAlive()) {
            System.out.println("You have been defeated!");
        }
    }

    public void getInput(Scanner scanner, Room currentRoom) {
        String input = scanner.nextLine();
        switch (input) {
            case "north":
            case "south":
            case "east":
            case "west":
                currentRoom.move(input);
                break;
            case "help":
                System.out.println("Valid commands: north, south, east, west, help, exit");
                break;
            case "exit":
                System.out.println("Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid command. Type 'help' for a list of valid commands.");
        }
    }
}
