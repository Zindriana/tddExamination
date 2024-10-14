package org.example;

import java.util.List;

public class Game {

    private final Player player;
    private final Item[] items = new Item[10]; //change this value later when we now how many different items exist in the game
    private final Building building = new Building();

    public Game(String name) {
        this.player = new Player(name);
    }

    public Item getItem(String itemName) {
        for(Item item : items){
            if(item.equals(itemName)){
                return item;
            }
        }
        return null;
    }

}
