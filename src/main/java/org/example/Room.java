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
    private final Text output = new Text();

    //constructors
    public Room(int roomNumber, String name, NPC npcInRoom)  {
        this.roomNumber = roomNumber;
        this.name = name;
        this.descriptionWhenEnteringRoom = output.getRoomDescriptionWhenEnter(name);
        this.descriptionOnInvestigateRoom = output.getRoomDescriptionWhenInvestigate(name);
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
    public void getListOfItems() {
        // controls if there are items in the room
        if (itemsInRoom.isEmpty()) {
            System.out.println("There are no items in this room.");
        } else {
            for (Item item : itemsInRoom) {
                System.out.println(item.getName());
            }
        }
    }

    //Entering Room
    public void enterRoom() {

    }

    public void investigateRoom() {
        System.out.println(getDescriptionOnInvestigateRoom());
        System.out.println(getNpcInRoom().getDescription());
        getListOfItems();
    }

}
