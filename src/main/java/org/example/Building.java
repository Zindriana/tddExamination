package org.example;

public class Building {

    private final Room[] rooms;

    public Building(){
        rooms = new Room[4];
        //insert code here to create and add the rooms to the building
    }

    public int getNumberOfRooms() {
        return rooms.length;
    }
}
