package com.skillstorm.project1.adventure;

import java.util.Scanner;

public class Player {

    private String name;
    private int maxHealth;
    private int currentHealth;
    private int attackDamage;
    private int gold;
    private int potions;
    private Room currentRoom;
    
    public Player(String name, int maxHealth, int attackDamage, int gold, int potions, Room startingRoom) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.attackDamage = attackDamage;
        this.gold = gold;
        this.potions = potions;
        this.currentRoom = startingRoom;
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] command = input.split(" ");
        switch (command[0]) {
            case "go":
                if (command.length == 1) {
                    System.out.println("Go where?");
                } else {
                    go(command[1]);
                }
                break;
            case "help":
                System.out.println("Commands:");
                System.out.println("go [direction]");
                System.out.println("attack");
                System.out.println("drink");
                System.out.println("status");
                System.out.println("shop");
                System.out.println("quit");
                break;
            case "attack":
                attack();
                break;
            case "drink":
                drink();
                break;
            case "status":
                status();
                break;
            case "shop":
                shop();
                break;
            case "quit":
                System.out.println("Quitting game...");
                System.exit(0);
            default:
                System.out.println("Invalid command. Type 'help' for a list of commands.");
        }
    }

    public void go(String direction) {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) {
            System.out.println("You can't go that way.");
        } else {
            currentRoom = nextRoom;
            System.out.println("You are now in " + currentRoom.getName());
            currentRoom.printInfo();
        }
    }

    public void attack() {
        Monster currentMonster = currentRoom.getMonster();
        if (currentMonster == null) {
            System.out.println("There is nothing to attack here.");
        } else {
            System.out.println("You attack the " + currentMonster.getName() + "!");
            currentMonster.takeDamage(attackDamage);
            if (currentMonster.getCurrentHealth() <= 0) {
                System.out.println("You have defeated the " + currentMonster.getName() + ".");
                gold += currentMonster.getGold();
                currentRoom.removeMonster();
            } else {
                System.out.println("The " + currentMonster.getName() + " has " + currentMonster.getCurrentHealth() + " health remaining.");
                currentMonster.attack(this);
            }
        }
    }

    public void drink() {
        if (potions == 0) {
            System.out.println("You don't have any potions.");
        } else {
            currentHealth += 20;
            if (currentHealth > maxHealth) {
                currentHealth = maxHealth;
            }
            potions--;
            System.out.println("You drink a potion and restore 20 health.");
            status();
        }
    }

    public void status() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + currentHealth + "/" + maxHealth);
        System.out.println("Attack damage: " + attackDamage);
        System.out.println("Gold: " + gold);
        System.out.println("Potions: " + potions);
    }

