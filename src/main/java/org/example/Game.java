package org.example;

import java.util.Scanner;

public class Game {
    private final Scanner sc = new Scanner(System.in);
    private Player player;
    private final Item[] items = new Item[10]; //change this value later when we now how many different items exist in the game
    private final NPC[] npcs = new NPC[4]; //change this value when we know how many npc we need
    private final Building building = new Building();

    public Game() {
        items[0] = new Item("Die", "A bright white six-sided die.");
        items[1] = new Item("Candle", "A thick white candle. It has been used sometime before.");
        items[2] = new Item("Key", "A golden key.");
        npcs[0] = new NPC("Hooded figure");
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
        System.out.println("Hello " + getPlayer().getName() + ". Welcome to my dungeon. To get out you need to solve my puzzles!");
    }

    public void InvestigateRoomOption(){
        getRoom(player.getCurrentRoom()).investigateRoom();

        System.out.println("What do you want to do?");
        System.out.println("1.Pick up an item\n2.Use an item\n3.Interact with the npc\n4.Nothing");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the index of the item: ");
                int itemIndex = sc.nextInt();
                getPlayer().backpack.add(getRoom(player.getCurrentRoom()).itemsInRoom.get(itemIndex));
                break;
            case 2:
                System.out.println("Enter the index of the item: ");
                int itemIndex2 = sc.nextInt();
                getRoom(player.getCurrentRoom()).itemsInRoom.get(itemIndex2).use();
                break;
            case 3:
                getRoom(player.getCurrentRoom()).getNpcInRoom().interact(getPlayer(), getRoom(getPlayer().getCurrentRoom()));
                break;
            case 4:
                break;

        }
    }

    public Item getItem(String itemName) {
        for(Item item : items){
            if(item != null && item.getName().equals(itemName)){
                return item;
            }
        }
        return null;
    }

    public NPC getNPC(String npcName) {
        for(NPC npc : npcs){
            if(npc != null && npc.getName().equals(npcName))
             return npc;
        }
        return null;
    }

    public Room getRoom(int roomNumber) {
        return building.getRoom(roomNumber);
    }

    public Player getPlayer() {
        return player;
    }

}
