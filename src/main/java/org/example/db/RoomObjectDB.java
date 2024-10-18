package org.example.db;

import org.example.models.Room;
import org.example.models.RoomObjects.RoomObject;

public class RoomObjectDB {

    private RoomObject[] roomObjects = new RoomObject[10];

    public RoomObjectDB() {

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
