package com.skillstorm.project1.adventure;

import com.skillstorm.Project.Player;

public class Monster {
    private String name;
    private int health;
    private int attack;
    private int defense;

    public Monster(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
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

    public int getDefense() {
        return defense;
    }

    public void attack(Player player) {
        int damage = Math.max(0, this.attack - player.getDefense());
        player.takeDamage(damage);
        System.out.println(this.name + " attacked you and dealt " + damage + " damage!");
    }
}