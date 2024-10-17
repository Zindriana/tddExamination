package org.example.game;

import org.example.db.*;
import org.example.models.Item;
import org.example.models.NPC;
import org.example.models.Player;
import org.example.models.Room;

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
        System.out.println("Hello " + getPlayer().getName() + ". Welcome to my dungeon. To get out of here, you need to solve my puzzles!\n");
    }

    public void InvestigateRoomOption(){
        getRoom(player.getCurrentRoom()).investigateRoom();

        System.out.println("What do you want to do?");
        System.out.println("1.Pick up an item\n2.Use an item\n3.Interact with the npc\n4.Nothing");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine().trim();
        switch (choice) {
            case "1":
                System.out.println("Enter the index of the item: ");
                int itemIndex = sc.nextInt();
                getPlayer().backpack.add(getRoom(player.getCurrentRoom()).itemsInRoom.get(itemIndex));
                break;
            case "2":
                System.out.println("Enter the index of the item: ");
                int itemIndex2 = sc.nextInt();
                getRoom(player.getCurrentRoom()).itemsInRoom.get(itemIndex2).use();
                break;
            case "3":
                getRoom(player.getCurrentRoom()).getNpcInRoom().interact(getPlayer(), getRoom(getPlayer().getCurrentRoom()));
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
