package org.example;

public class Building {

    private final Room[] rooms;

    public Building(){
        rooms = new Room[4];
        rooms[0] = new Room(0, "Starting room");
        rooms[1] = new Room(1, "Middle room");
        rooms[2] = new Room(2, "Third room");
        rooms[3] = new Room(3, "Last room");
    }

    public int getNumberOfRooms() {
        return rooms.length;
    }

    public Room getRoom(int roomNumber) {
        return rooms[roomNumber];
    }
}
