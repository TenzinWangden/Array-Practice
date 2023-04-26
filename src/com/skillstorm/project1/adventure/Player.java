package com.skillstorm.project1.adventure;

public class Player {
    protected String name;
    protected String className;

    public Player(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public String getName() {
        return this.name;
    }

    public String getClassName() {
        return this.className;
    }

	public int getStrength() {
		return this.getStrength();
	}

	public int getAgility() {
		// TODO Auto-generated method stub
		return this.getAgility();
	}

	public int getLuck() {
		// TODO Auto-generated method stub
		return this.getLuck();
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
