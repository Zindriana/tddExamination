package org.example.db;

import org.example.models.RoomObjects.*;

public class RoomObjectDB {

    private RoomObject[] roomObjects = new RoomObject[10];

    public RoomObjectDB() {
        roomObjects[0] = new Bench();
    }

    public RoomObject getRoomObjects(String objectName) {
        for (RoomObject obj: roomObjects) {
            if (obj.getName().equals(objectName)) {
                return obj;
            }
        }
        return null;
    }
}
