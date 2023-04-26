package com.skillstorm.project1.adventure;

public class Room {
    private String description;
    private Room[] exits;

    public Room(String description) {
        this.description = description;
        exits = new Room[4];
    }

    public void setExit(int direction, Room neighbor) {
        exits[direction] = neighbor;
    }

    public String getDescription() {
        return description;
    }

    public String getExitString() {
        String exitString = "Exits: ";
        for (int i = 0; i < exits.length; i++) {
            if (exits[i] != null) {
                exitString += getDirectionName(i) + " ";
            }
        }
        return exitString;
    }

    public Room getExit(int direction) {
        return exits[direction];
    }

    private String getDirectionName(int direction) {
        switch (direction) {
            case 0:
                return "north";
            case 1:
                return "east";
            case 2:
                return "south";
            case 3:
                return "west";
            default:
                return "unknown";
        }
    }
}
