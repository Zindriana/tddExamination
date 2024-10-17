package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Room {

    //fields
    private final int roomNumber;
    private final String name;
    private final String descriptionWhenEnteringRoom;
    private final String descriptionOnInvestigateRoom;
    public List<Item> itemsInRoom = new ArrayList<Item>();
    private NPC npcInRoom;
    private final Text output = new Text();
    private Game game;

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
        System.out.println("Items in the room: ");
        getListOfItems();
        System.out.println("what do you want to do?");
        System.out.println("1.pick up an item\n2.use an item\3.interact with the npc\4.nothing");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the index of the item: ");
                int itemIndex = sc.nextInt();
                game.getPlayer().backpack.add(itemsInRoom.get(itemIndex));
                break;
            case 2:
                System.out.println("Enter the index of the item: ");
                int itemIndex2 = sc.nextInt();
                itemsInRoom.get(itemIndex2).use();
                break;
            case 3:
                //npc kod
                break;
            case 4:
                break;

        }
    }

}
