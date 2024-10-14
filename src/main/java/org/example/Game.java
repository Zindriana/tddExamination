package org.example;

import java.util.List;
import java.util.Scanner;

public class Game {
    private Scanner sc = new Scanner(System.in);
    private Player player;
    private final Item[] items = new Item[10]; //change this value later when we now how many different items exist in the game
    private final Building building = new Building();

    public Game() {

    }

    public void startGame(){
        System.out.println("Choose your name");
        String name = sc.nextLine().trim();
        while(name.isEmpty()){
            System.out.println("The name cannot be empty, please choose a name");
            name = sc.nextLine().trim();
        }
        player = new Player(name);
    }

    public Item getItem(String itemName) {
        for(Item item : items){
            if(item != null && item.getName().equals(itemName)){
                return item;
            }
        }
        return null;
    }

    public Player getPlayer() {
        return player;
    }

}
