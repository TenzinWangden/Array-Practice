package com.skillstorm.project1.adventure;

public abstract class Player {
    private String name;
    private int strength;
    private int agility;

    public Player(String name, int strength, int agility) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public abstract String getClassName();

    public static class Warrior extends Player {
        public Warrior(String name, int strength) {
            super(name, strength, 0);
        }

        public String getClassName() {
            return "Warrior";
        }
    }

    public static class Rogue extends Player {
        public Rogue(String name, int agility) {
            super(name, 0, agility);
        }

        public String getClassName() {
            return "Rogue";
        }
    }
}

