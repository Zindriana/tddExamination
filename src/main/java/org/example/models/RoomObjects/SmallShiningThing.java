package org.example.models.RoomObjects;

import org.example.models.Player;
import org.example.models.Room;
import org.example.models.items.Die;

public class SmallShiningThing extends RoomObject {

    public SmallShiningThing() {
        super("A small shining thing");
    }

    @Override
    public void interactWithObject(Room room, Player player) {
        System.out.println(getDescription());
        Player.backpack.add(new Die());
        room.objectsInRoom.remove(room.getRoomObject(getName()));
        //update the room description in room one, the player shouldn´t get info about a shiny thing anymore
        //Check if it is possible to just remove that one sentence. Then it doesn´t disturb other potential changes.
        }
    }