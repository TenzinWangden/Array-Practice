package com.skillstorm.project1.adventure;

public class Room {
    private String name;
    private String description;
    private boolean isExit;

    private Room north;
    private Room south;
    private Room east;
    private Room west;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.isExit = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isExit() {
        return isExit;
    }

    public void setExit() {
        this.isExit = true;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getExit(String direction) {
        if (direction.equalsIgnoreCase("north")) {
            return this.north;
        } else if (direction.equalsIgnoreCase("south")) {
            return this.south;
        } else if (direction.equalsIgnoreCase("east")) {
            return this.east;
        } else if (direction.equalsIgnoreCase("west")) {
            return this.west;
        } else {
            return null;
        }
    }
}
