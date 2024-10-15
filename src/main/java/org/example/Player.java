package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private int currentRoom;
    public List<Item> backpack = new ArrayList<Item>();
    Building building = new Building();

    public Player(String name){
        this.name = name;
    }

    public void moveForward(){
        if(currentRoom == building.getNumberOfRooms() -1){
            throw new IllegalStateException("You cant move forward, room " + currentRoom + " is the last room\n");
        }
        currentRoom++;
    }
    public void moveBack(){
        if(currentRoom == 0){
            throw new IllegalStateException("You cant move back, room 0 is the first room\n");
        }
        currentRoom--;
    }
    public void checkBackpack(){
        if(backpack.isEmpty()){
            throw new IllegalStateException("There are no items in the backpack\n");
        }
        for(Item item : backpack){
            System.out.println("The items in your backpack is: \n" + item + "\n");
        }
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
}


