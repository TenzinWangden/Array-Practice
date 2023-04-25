package com.skillstorm.project1.adventure;

import java.util.Scanner;

public class Player {

    private String name;
    private int health;
    private int maxHealth;
    private int attack;
    private int defense;
    private int gold;
    private Item[] inventory;
    private Room currentRoom;

    // Constructor
    public Player(String name, int health, int attack, int defense, int gold, Item[] inventory, Room currentRoom) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.attack = attack;
        this.defense = defense;
        this.gold = gold;
        this.inventory = inventory;
        this.currentRoom = currentRoom;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    // Method to move the player to a new room
    public void move(String direction) {
        Room newRoom = currentRoom.getExit(direction);
        if (newRoom == null) {
            System.out.println("You cannot go that way.");
        } else {
            currentRoom = newRoom;
            System.out.println("You have entered " + currentRoom.getName());
        }
    }

    // Method to display the player's current status
    public void displayStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health + "/" + maxHealth);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Gold: " + gold);
        System.out.println("Inventory:");
        for (Item item : inventory) {
            if (item != null) {
                System.out.println("- " + item.getName());
            }
        }
    }

    // Method to attack a monster
    public void attack(Monster monster) {
        int damage = this.getAttackPower();
        monster.takeDamage(damage);
        System.out.println("You hit the " + monster.getName() + " for " + damage + " damage!");
        
        if (!monster.isAlive()) {
            System.out.println("The " + monster.getName() + " has been defeated!");
        } else {
            int monsterDamage = monster.getAttackPower();
            this.takeDamage(monsterDamage);
            System.out.println("The " + monster.getName() + " hit you for " + monsterDamage + " damage!");
            
            if (!this.isAlive()) {
                System.out.println("You have been defeated. Game over.");
                System.exit(0);
            }
        }
    }