package com.skillstorm.project1.adventure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skillstorm.Project.Player;
import com.skillstorm.Project.Room;

public class Game {
    private Player player;
    private List<Room> rooms;
    private boolean gameOver;

    public Game() {
        rooms = new ArrayList<>();
        rooms.add(new Room("Hall", "A dark and spooky hallway."));
        rooms.add(new Room("Kitchen", "A dirty kitchen with broken utensils."));
        rooms.add(new Room("Bedroom", "A creepy bedroom with creaky floors."));
        rooms.add(new Room("Living Room", "A dusty living room with old furniture."));
        rooms.add(new Room("Bathroom", "A moldy bathroom with a leaky faucet."));
        rooms.add(new Room("Basement", "A damp and dark basement with cobwebs."));
        player = new Player();
        player.setCurrentRoom(rooms.get(0));
        gameOver = false;
    }

    public void start() {
        System.out.println("Welcome to the Adventure game!");
        System.out.println("You find yourself in a dark hallway.");
        System.out.println("Your objective is to find your way out of the house.");
        System.out.println("Type 'help' for a list of commands.");
        Scanner scanner = new Scanner(System.in);
        while (!gameOver) {
            System.out.println(player.getCurrentRoom().getName() + " - " + player.getCurrentRoom().getDescription());
            System.out.print(">> ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("help")) {
                System.out.println("Available commands:");
                System.out.println("go <direction> - move to the room in the specified direction");
                System.out.println("look - examine the current room");
                System.out.println("inventory - view your inventory");
                System.out.println("quit - exit the game");
            } else if (input.startsWith("go ")) {
                String direction = input.substring(3);
                player.move(direction);
                if (player.getCurrentRoom().isExit()) {
                    gameOver = true;
                    System.out.println("Congratulations! You escaped the house.");
                }
            } else if (input.equalsIgnoreCase("look")) {
                System.out.println(player.getCurrentRoom().getDescription());
                if (player.getCurrentRoom().hasMonster()) {
                    System.out.println("There is a monster in this room!");
                } else if (player.getCurrentRoom().hasItem()) {
                    System.out.println("There is an item in this room: " + player.getCurrentRoom().getItem().getName());
                }
            } else if (input.equalsIgnoreCase("inventory")) {
                player.showInventory();
            } else if (input.equalsIgnoreCase("quit")) {
                System.out.println("Thanks for playing!");
                gameOver = true;
            } else {
                System.out.println("Invalid command!");
            }
        }
        scanner.close();
    }
}
