package org.example.db;

import org.example.models.RoomObjects.*;

public class RoomObjectDB {

    private final RoomObject[] roomObjects = new RoomObject[10];

    public RoomObjectDB() {
        roomObjects[0] = new Bench();
        roomObjects[1] = new LargeHole();
        roomObjects[2] = new SmallShiningThing();
        roomObjects[3] = new CircleOfCandles();
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
