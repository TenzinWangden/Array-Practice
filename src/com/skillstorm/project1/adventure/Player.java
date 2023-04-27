package com.skillstorm.project1.adventure;

public class Player {
    private int health;
    private int damage;
    private Room currentRoom;

    public Player() {
        this.health = 100;
        this.damage = 10;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public int calculateDamage() {
        int totalDamage = this.damage;
        if (this.currentRoom != null && this.currentRoom.getMonster() != null) {
            totalDamage += this.currentRoom.getMonster().getDamage();
        }
        return totalDamage;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}
