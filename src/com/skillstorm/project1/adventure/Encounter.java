package com.skillstorm.project1.adventure;

import java.util.Random;

public class Encounter {
    private String type;
    private int difficulty;

    public Encounter(String type, int difficulty) {
        this.type = type;
        this.difficulty = difficulty;
    }

    public boolean isMonster() {
        return this.type.equals("monster");
    }

    public boolean isChest() {
        return this.type.equals("chest");
    }

    public int getDifficulty() {
        return this.difficulty;
    }

    public int calculateReward(Player player) {
        Random rand = new Random();
        if (isMonster()) {
            int reward = rand.nextInt(difficulty * 5) + 1;
            reward = (int) Math.round(reward * (1 + player.getLevel() / 10.0));
            return reward;
        } else if (isChest()) {
            int reward = rand.nextInt(difficulty * 10) + 1;
            reward = (int) Math.round(reward * (1 + player.getLevel() / 5.0));
            return reward;
        } else {
            return 0;
        }
    }
}
