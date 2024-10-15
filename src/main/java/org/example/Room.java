package org.example;

import java.util.ArrayList;
import java.util.List;

public class Room {

    //fields
    private final int roomNumber;
    private final String name;
    private final String descriptionWhenEnteringRoom;
    private final String descriptionOnInvestigateRoom;
    public List<Item> itemsInRoom = new ArrayList<Item>();
    private NPC npcInRoom;

    //constructors
    public Room(int roomNumber, String name, String descriptionWhenEnteringRoom, String descriptionOnInvestigateRoom, NPC npcInRoom)  {
        this.roomNumber = roomNumber;
        this.name = name;
        this.descriptionWhenEnteringRoom = descriptionWhenEnteringRoom;
        this.descriptionOnInvestigateRoom = descriptionOnInvestigateRoom;
        this.npcInRoom = npcInRoom;

    }

    //getters
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getName() {
        return name;
    }

    public String getDescriptionWhenEnteringRoom() {
        return descriptionWhenEnteringRoom;
    }

    public String getDescriptionOnInvestigateRoom() {
        return descriptionOnInvestigateRoom;
    }
    
    public NPC getNpcInRoom() {
        return npcInRoom;
    }

    //setters
    public void setNpcInRoom(NPC npcInRoom) {
        this.npcInRoom = npcInRoom;

    }




    // gets a list of all items in the room
    public List<Item> getListOfItems() {
        // controls if there are items in the room
        if (itemsInRoom == null) {
            System.out.println("There are no items in this room.");
            return null;
        }
        return itemsInRoom;
    }

    // TODO:investigate Room, descriptions of room, all items and NPC


}
