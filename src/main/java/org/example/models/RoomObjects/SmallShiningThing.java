package org.example.models.RoomObjects;

import org.example.models.Player;
import org.example.models.Room;

public class SmallShiningThing extends RoomObject {

    public SmallShiningThing() {
        super("Small Shining Thing");
    }

    @Override
    public void interactWithObject(Room room, Player player) {
        System.out.println("You see a small shining thing among some stones.\n" +
                "It is a white bright six sided die that emit a weak light. \n" +
                "You hear the hooded figure gives away a silent chuckle when \n" +
                "you put it in your pocket.");
        Player.backpack.add(room.getItem("Die"));
        room.objectsInRoom.remove(room.getRoomObject("Small Shining Thing"));
        }
    }