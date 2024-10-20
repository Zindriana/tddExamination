package org.example.game;

import org.example.db.*;
import org.example.models.items.Item;
import org.example.models.NPC;
import org.example.models.Player;
import org.example.models.Room;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private final Scanner sc = new Scanner(System.in);
    private Player player;
    private final ItemDB items = new ItemDB();
    private final NpcDB npcs = new NpcDB();
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
        player = new Player(name, building);
        player.setCurrentRoom(0);
        System.out.println("You wake up, dizzy and cold. You lay on an uneven naked stone floor. \nIt seems that you are in some sort of dim lit cavern.");
    }

    public void InvestigateRoomOption(){
        getRoom(player.getCurrentRoom()).investigateRoom();

        System.out.println("\nWhat do you want to do?");
        System.out.println("1.Interact with an object\n2.Interact with the npc\n3.Nothing");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine().trim();
        switch (choice) {
//            case "1": //Pick up an item
//                System.out.println("Enter the index of the item: ");
//                int itemIndex = sc.nextInt();
//                try {
//                    getRoom(player.getCurrentRoom()).itemsInRoom.get(itemIndex).pickUp();
//                    getPlayer().backpack.add(getRoom(player.getCurrentRoom()).itemsInRoom.get(itemIndex));
//                } catch (IndexOutOfBoundsException e) {
//                    System.out.println("You must choose another index");
//                } catch (IllegalStateException i){
//                    System.out.println("Must choose a number");
//                }
//
//                break;
            case "1": //Interact with object
                System.out.println("Enter the index of the object: ");
                try {
                    int objectIndex = sc.nextInt();
                    getRoom(player.getCurrentRoom()).objectsInRoom.get(objectIndex).interactWithObject(getRoom(player.getCurrentRoom()), player);;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("You must choose another index");

                } catch (InputMismatchException i){
                    System.out.println("Must choose a number");
                }
                break;
            case "2": //Interact with npc
                if(getRoom(player.getCurrentRoom()).getNpcInRoom() != null){
                    getRoom(player.getCurrentRoom()).getNpcInRoom().interact(getPlayer(), getRoom(getPlayer().getCurrentRoom()));
                } else {
                    System.out.println("There is no one else in the room. That you know about at least... \n");
                }
                break;
            default:
                break;

        }
    }

    public Item getItem(String itemName) {return items.getItem(itemName);}

    public NPC getNPC(String npcName) {return npcs.getNPC(npcName);}

    public Room getRoom(int roomNumber) {
        return building.getRoom(roomNumber);
    }

    public Player getPlayer() {
        return player;
    }

}
