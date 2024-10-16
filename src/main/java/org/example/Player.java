package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    public void checkBackpack() {
        if (backpack.isEmpty()) {
            throw new IllegalStateException("There are no items in the backpack\n");
        }
        System.out.println("The items in your backpack is: ");
        for (int i = 0; i < backpack.size(); i++) {
            System.out.println((i) + ". " + backpack.get(i).getName());
        }
        System.out.println("Do you want to use an item? (y/n)");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if (choice.equals("y")) {
            System.out.println("Chose the item you want to use with index nr");
            int choice2 = sc.nextInt();
            backpack.get(choice2).use();
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


