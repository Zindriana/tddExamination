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

}


