package com.skillstorm.project1.adventure;

public class Exit {

    private String direction;
    private int roomNumber;
    private Item key;

    public Exit(String direction, int roomNumber) {
        this.direction = direction;
        this.roomNumber = roomNumber;
        this.key = null;
    }

    public Exit(String direction, int roomNumber, Item key) {
        this.direction = direction;
        this.roomNumber = roomNumber;
        this.key = key;
    }

    public String getDirection() {
        return direction;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Item getKey() {
        return key;
    }

    public boolean isLocked() {
        return (key != null);
    }

}
