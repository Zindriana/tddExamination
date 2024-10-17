package org.example.db;

import org.example.models.Room;

public class Building {

    private final Room[] rooms = new Room[4];
    private final NpcDB npcDB = new NpcDB();
    private final ItemDB itemDB = new ItemDB();

    public Building(){
        //adding rooms
        rooms[0] = new Room(0, "Starting room");
        rooms[1] = new Room(1, "Middle room");
        rooms[2] = new Room(2, "Third room");
        rooms[3] = new Room(3, "Last room");

        //adding stuff to the rooms
        rooms[0].setNpcInRoom(npcDB.getNPC("Hooded figure"));
        rooms[0].itemsInRoom.add(itemDB.getItem("Die"));
        rooms[0].itemsInRoom.add(itemDB.getItem("Candle"));
    }

    public int getNumberOfRooms() {
        return rooms.length;
    }

    public Room getRoom(int roomNumber) {
        return rooms[roomNumber];
    }

    public String getName(int roomNumber) {
        return rooms[roomNumber].getName();
    }
}
