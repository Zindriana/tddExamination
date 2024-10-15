package org.example;

public class Building {

    private Room[] rooms;

    public Building(){
        rooms = new Room[4];
    }

    public int getNumberOfRooms() {
        return rooms.length;
    }
}
