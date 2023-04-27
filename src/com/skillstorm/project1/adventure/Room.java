package com.skillstorm.project1.adventure;

public class Room {
    private String name;
    private String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Monster monster;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
        north.setSouth(this);
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
        south.setNorth(this);
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
        east.setWest(this);
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
        west.setEast(this);
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }
    
    public boolean hasMonster() {
        return monster != null && monster.isAlive();
    }
    
    public Room getExit(String direction) {
        switch (direction) {
            case "north":
                return north;
            case "south":
                return south;
            case "east":
                return east;
            case "west":
                return west;
            default:
                return null;
        }
    }
    public String getExitString() {
        StringBuilder exits = new StringBuilder("Exits: ");
        if (north != null) {
            exits.append("north ");
        }
        if (east != null) {
            exits.append("east ");
        }
        if (south != null) {
            exits.append("south ");
        }
        if (west != null) {
            exits.append("west ");
        }
        return exits.toString();
    }
}
