package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private int currentRoom;
    private List<Item> backpack = new ArrayList<Item>();

    public Player(String name){
        this.name = name;
    }

    public void moveForward(){
        currentRoom++;
    }
    public void moveBack(){
        currentRoom--;
    }
    public void checkBackpack(){
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


