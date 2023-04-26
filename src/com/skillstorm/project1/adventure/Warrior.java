package com.skillstorm.project1.adventure;

public class Warrior extends Player {
    public Warrior() {
        health = 100;
        strength = 12;
        agility = 5;
        luck = 4;
    }

    @Override
    public String getType() {
        return "Warrior";
    }

    @Override
    public void specialAbility() {
        System.out.println("You let out a mighty roar, intimidating the enemy and increasing your strength by 5.");
        strength += 5;
    }
}
