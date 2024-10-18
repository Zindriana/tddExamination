package org.example.models;

import org.example.db.Building;
import org.example.models.items.Item;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Player {

    private final String name;
    private int currentRoom;
    public static List<Item> backpack = new ArrayList<>();
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
            System.out.println(building.getRoom(currentRoom).getDescriptionWhenEnteringRoom());
        }

    }
    public void moveBack(){
        if(currentRoom == 0){
            throw new IllegalStateException("You can't move back, there is only one way out of here, and it is forward!");
        }
        currentRoom--;
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
        System.out.println("Which item do you want to use? (choose a number not in the backpack to exit)");
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int choice = sc.nextInt();
                if (choice < 0 || choice >= backpack.size()) {
                    break;
                }
                backpack.get(choice).use(building.getRoom(getCurrentRoom()));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Must choose a valid number");
                sc.next();
            }
        }
    }

    public static Item getItem(String itemName) {
        for (Item item : backpack) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        }
        return null;
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


