package org.example;

import java.util.List;

public class Room {

    //fields
    private final int roomNumber;
    private final String name;
    private final String descriptionEnter;
    private final String descriptionOfInvestigate;
    private List<Item> items;
    private NPC npc;

    //constructors
    public Room(int roomNumber, String name, String descriptionEnter, String descriptionOfInvestigate)  {
        this.roomNumber = roomNumber;
        this.name = name;
        this.descriptionEnter = descriptionEnter;
        this.descriptionOfInvestigate = descriptionOfInvestigate;
    }

    //getters
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return descriptionEnter;
    }

    public String getDescriptionOfInvestigate() {
        return descriptionOfInvestigate;
    }

    // investigate Room
    public void investigate() {

    }


}
