package org.example.models;

import org.example.game.Text;
import org.example.models.RoomObjects.RoomObject;
import org.example.models.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Room {

    //fields
    private final int roomNumber;
    private final String name;
    private final String descriptionWhenEnteringRoom;
    private final String descriptionOnInvestigateRoom;
    public List<Item> itemsInRoom = new ArrayList<Item>();
    private List<RoomObject> objectsInRoom = new ArrayList<>();
    private NPC npcInRoom;
    private final Text output = new Text();
    private boolean isDoorLocked = true;

    //constructors
    public Room(int roomNumber, String name)  {
        this.roomNumber = roomNumber;
        this.name = name;
        this.descriptionWhenEnteringRoom = output.getRoomDescriptionWhenEnter(name);
        this.descriptionOnInvestigateRoom = output.getRoomDescriptionWhenInvestigate(name);
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

    // get room object method
    public RoomObject getRoomObject(String roomObject) {
        for(RoomObject obj : objectsInRoom) {
            if (obj.getName().equals(roomObject)) {
                return obj;
            }
        }
        return null;
    }
    // gets a list of all items in the room
    public void getListOfItems() {
        // controls if there are items in the room
        if (itemsInRoom.isEmpty()) {
            System.out.println("There are no items in this room.");
        } else {
            for (int i = 0; i < itemsInRoom.size(); i++) {
                System.out.println((i) + ". " + itemsInRoom.get(i).getName());
            }
        }
    }

    //setters
    public void setNpcInRoom(NPC npcInRoom) {
        this.npcInRoom = npcInRoom;

    }

    //get a list of all objects in the room
    public void getListOfObjects() {
        if (objectsInRoom.isEmpty()) {
            System.out.println("There are no objects in this room.");
        } else
            for (int i = 0; i < objectsInRoom.size(); i++) {
                System.out.println((i) + ". " + objectsInRoom.get(i).getName());
            }
    }

    public void investigateRoom() {
        System.out.println(getDescriptionOnInvestigateRoom());
        System.out.println("Items in the room: ");
        getListOfItems();
    }

    public boolean getIsDoorLocked() {
        return isDoorLocked;
    }

    public void setDoorIsLocked(boolean doorIsLocked) {
        this.isDoorLocked = doorIsLocked;
    }

}
