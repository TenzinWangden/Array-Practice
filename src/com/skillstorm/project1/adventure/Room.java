package com.skillstorm.project1.adventure;

import java.util.ArrayList;

public class Room {
    private String name;
    private String description;
    private ArrayList<Item> items;
    private Monster monster;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.items = new ArrayList<>();
        this.monster = null;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public boolean hasMonster() {
        return monster != null;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", items=" + items +
                ", monster=" + monster +
                '}';
    }
}
