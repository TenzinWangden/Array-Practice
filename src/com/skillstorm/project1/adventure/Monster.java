package com.skillstorm.project1.adventure;

public class Monster {
    private String name;
    private int health;
    private int attackDamage;

    public Monster(String name, int health, int attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int calculateDamage() {
        return attackDamage;
    }
    
    public boolean isAlive() {
        return health > 0;
    }
}
