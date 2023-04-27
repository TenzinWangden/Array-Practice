package com.skillstorm.project1.adventure;

import java.util.Scanner;

public class Game {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create rooms
        Room startRoom = new Room("Start Room");
        Room northRoom = new Room("North Room");
        Room eastRoom = new Room("East Room");
        Room southRoom = new Room("South Room");
        Room westRoom = new Room("West Room");

        // Connect rooms
        startRoom.setNorth(northRoom);
        northRoom.setSouth(startRoom);
        startRoom.setEast(eastRoom);
        eastRoom.setWest(startRoom);
        startRoom.setSouth(southRoom);
        southRoom.setNorth(startRoom);
        startRoom.setWest(westRoom);
        westRoom.setEast(startRoom);

        // Create player
        Player player = new Player();
        player.setCurrentRoom(startRoom);

        // Create monster
        Monster monster = new Monster("Goblin", 20, 5);
        northRoom.setMonster(monster);

        // Game loop
        boolean gameover = false;
        while (!gameover) {
            // Print current room description
            System.out.println(player.getCurrentRoom().getName());
            System.out.println(player.getCurrentRoom().getDescription());

            // Print available exits
            System.out.println(player.getCurrentRoom().getExitString());

            // Check for monster in current room
            Monster currentMonster = player.getCurrentRoom().getMonster();
            if (currentMonster != null) {
                System.out.println("You encounter a " + currentMonster.getName() + "!");
                // Battle loop
                boolean battleOver = false;
                while (!battleOver) {
                    // Player attacks monster
                    int playerDamage = player.calculateDamage();
                    currentMonster.takeDamage(playerDamage);
                    System.out.println("You attack the " + currentMonster.getName() + " for " + playerDamage + " damage!");
                    if (!currentMonster.isAlive()) {
                        System.out.println("You have defeated the " + currentMonster.getName() + "!");
                        player.getCurrentRoom().setMonster(null);
                        battleOver = true;
                        break;
                    }
                    // Monster attacks player
                    int monsterDamage = currentMonster.calculateDamage();
                    player.takeDamage(monsterDamage);
                    System.out.println("The " + currentMonster.getName() + " attacks you for " + monsterDamage + " damage!");
                    if (!player.isAlive()) {
                        System.out.println("You have been defeated by the " + currentMonster.getName() + "!");
                        gameover = true;
                        battleOver = true;
                        break;
                    }
                }
            }

            // Check for game over
            if (!player.isAlive()) {
                System.out.println("Game over");
                gameover = true;
                break;
            }

            // Prompt player for input
            System.out.print("Enter a direction: ");
            String input = scanner.nextLine();
            Room nextRoom = player.getCurrentRoom().getExit(input);
            if (nextRoom == null) {
                System.out.println("You cannot go that way.");
            } else {
                player.setCurrentRoom(nextRoom);
            }

            // Check for game over
            if (!player.isAlive()) {
                System.out.println("Game over");
                gameover = true;
            }
        }
    }
}
