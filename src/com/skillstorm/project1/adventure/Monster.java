package com.skillstorm.project1.adventure;

public class Monster {
    private String name;
    private int health;
    private int attackPower;

    public Monster(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void attack(Player player) {
        int damage = this.getAttackPower();
        player.takeDamage(damage);
        System.out.println(this.getName() + " attacked you for " + damage + " damage!");
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attackPower=" + attackPower +
                '}';
    }
}
