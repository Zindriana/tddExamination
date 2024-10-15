package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private int currentRoom;
    public List<Item> backpack = new ArrayList<Item>();

    public Player(String name){
        this.name = name;
    }

    public void moveForward(){
        if(currentRoom == 3){
            throw new IllegalStateException("You cant move forward, room 3 is the last room");
        }
        currentRoom++;
    }
    public void moveBack(){
        if(currentRoom == 0){
            throw new IllegalStateException("You cant move back, room 0 is the first room");
        }
        currentRoom--;
    }
    public void checkBackpack(){
        if(backpack.isEmpty()){
            throw new IllegalStateException("There are no items in the backpack");
        }
        for(Item item : backpack){
            System.out.println(item);
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


