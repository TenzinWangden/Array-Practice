package com.skillstorm.project1.adventure;

public class Player {
    protected String name;
    protected String className;
    protected int level;

    public Player(String name, String className) {
        this.name = name;
        this.className = className;
        this.level = 1;
    }

    public String getName() {
        return this.name;
    }

    public String getClassName() {
        return this.className;
    }

    public int getLevel() {
        return this.level;
    }
}

class Warrior extends Player {
    private int strength;

    public Warrior(String name) {
        super(name, "Warrior");
        this.strength = 10;
    }

    public int getStrength() {
        return this.strength;
    }
}

class Rogue extends Player {
    private int agility;

    public Rogue(String name) {
        super(name, "Rogue");
        this.agility = 10;
    }

    public int getAgility() {
        return this.agility;
    }
}

class Archer extends Player {
    private int luck;

    public Archer(String name) {
        super(name, "Archer");
        this.luck = 10;
    }

    public int getLuck() {
        return this.luck;
    }
}
