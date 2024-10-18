package org.example.db;

import org.example.models.Room;

public class Building {

    private final Room[] rooms = new Room[4];
    private final NpcDB npcDB = new NpcDB();
    private final ItemDB itemDB = new ItemDB();
    private final RoomObjectDB roomObjectDB = new RoomObjectDB();

    public Building(){
        //adding rooms
        rooms[0] = new Room(0, "Starting room");
        rooms[1] = new Room(1, "Middle room");
        rooms[2] = new Room(2, "Third room");
        rooms[3] = new Room(3, "Last room");

        //adding stuff to the rooms
        //room 1
        rooms[0].setNpcInRoom(npcDB.getNPC("Hooded figure"));
        rooms[0].itemsInRoom.add(itemDB.getItem("Die"));
        rooms[0].itemsInRoom.add(itemDB.getItem("Candle"));
        rooms[0].objectsInRoom.add(roomObjectDB.getRoomObjects("Bench"));

        //room 2
        rooms[1].setRoomDark(true);
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
