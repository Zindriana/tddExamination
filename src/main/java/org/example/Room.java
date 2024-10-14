package org.example;

import java.util.List;

public class Room {

    //fields
    private int roomNumber;
    private String name;
    private String description;
    private List<Item> items;

    //constructors
    public Room(int roomNumber, String name, String description)    {
        this.roomNumber = roomNumber;
        this.name = name;
        this.description = description;
    }

    //getters
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
