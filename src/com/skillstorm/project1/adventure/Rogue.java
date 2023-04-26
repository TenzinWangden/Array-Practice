package com.skillstorm.project1.adventure;

public class Rogue extends Player {
    public Rogue() {
        health = 60;
        strength = 8;
        agility = 12;
        luck = 6;
    }

    @Override
    public String getType() {
        return "Rogue";
    }

    @Override
    public void specialAbility() {
        System.out.println("You vanish from sight, confusing the enemy and allowing you to escape.");
    }
}
