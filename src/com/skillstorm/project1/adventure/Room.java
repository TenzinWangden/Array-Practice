package com.skillstorm.project1.adventure;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String description;
    private Monster monster;
    private Item item;

    public Room(String description, Monster monster, Item item) {
        this.description = description;
        this.monster = monster;
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public Monster getMonster() {
        return monster;
    }

    public Item getItem() {
        return item;
    }

    public boolean hasMonster() {
        return monster != null && monster.getHealth() > 0;
    }

	public void move(String input) {
		// TODO Auto-generated method stub
		
	}
}