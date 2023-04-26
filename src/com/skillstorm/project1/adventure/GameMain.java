//package com.skillstorm.project1.adventure;
//
//import java.util.Scanner;
//
//public class GameMain {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Welcome to the Text Adventure Game!");
//        System.out.println("Please enter your name: ");
//        String playerName = scanner.nextLine();
//        
//        System.out.println("Please choose your class:");
//        System.out.println("1. Warrior");
//        System.out.println("2. Rogue");
//        System.out.println("3. Archer");
//        int classChoice = scanner.nextInt();
//        
//        Player player;
//        
//        switch(classChoice) {
//            case 1:
//                player = new Warrior(playerName);
//                break;
//            case 2:
//                player = new Rogue(playerName);
//                break;
//            case 3:
//                player = new Archer(playerName);
//                break;
//            default:
//                System.out.println("Invalid choice. Defaulting to Warrior class.");
//                player = new Warrior(playerName);
//                break;
//        }
//        
//        System.out.println("Welcome, " + player.getName() + "! You have chosen to be a " + player.getClassName() + ".");
//        System.out.println("Your stats are: ");
//        System.out.println("Level: " + player.getLevel());
//        System.out.println("Strength: " + player.getStrength());
//        System.out.println("Agility: " + player.getAgility());
//        System.out.println("Luck: " + player.getLuck());
//        
//        scanner.close();
//    }
//}
