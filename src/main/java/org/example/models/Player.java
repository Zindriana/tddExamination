package org.example.models;

import org.example.db.Building;
import org.example.models.items.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    private final String name;
    private int currentRoom;
    public List<Item> backpack = new ArrayList<>();
    private final Building building;


    public Player(String name, Building building) {
        this.name = name;
        this.building = building;
    }

    public Room getRoom() {
        return building.getRoom(getCurrentRoom());
    }

    public void moveForward(){
        if(currentRoom == building.getNumberOfRooms() -1){
            throw new IllegalStateException("You can't move forward, room " + currentRoom + " is the last room\n");
        }
        if(getRoom().getIsDoorLocked()){
            System.out.println("The door is locked. You need to find a way to unlock it");
        } else {
            currentRoom++;
            //updateItemsRoomNumberInBackpack();
            System.out.println(building.getRoom(currentRoom).getDescriptionWhenEnteringRoom());
        }

    }
    public void moveBack(){
        if(currentRoom == 0){
            throw new IllegalStateException("You can't move back, there is only one way out of here, and it is forward!");
        }
        currentRoom--;
        //updateItemsRoomNumberInBackpack();
        System.out.println(building.getRoom(currentRoom).getDescriptionWhenEnteringRoom());
    }
    public void checkBackpack() {
        if (backpack.isEmpty()) {
            throw new IllegalStateException("There are no items in the backpack\n");
        }
        System.out.println("The items in your backpack are: ");
        for (int i = 0; i < backpack.size(); i++) {
            System.out.println((i) + ". " + backpack.get(i).getName());
        }
        System.out.println("Do you want to use an item? (y/n)");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if (choice.equals("y")) {
            System.out.println("Choose the item you want to use with index nr");
            int choice2 = sc.nextInt();
            backpack.get(choice2).use(building.getRoom(getCurrentRoom()));
        }
    }

    public Building getBuilding() {
        return building;
    }

    public String getName() {
        return name;
    }

    public int getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(int currentRoom) {
        this.currentRoom = currentRoom;
    }

//    public void updateItemsRoomNumberInBackpack() {
//        for(Item item : backpack){
//            item.setCurrentRoom(getCurrentRoom());
//        }
//    }
}


