package org.example;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        game.startGame();
        NPC npc = new NPC();
        Item die = new Item("Die", "en tärning");
        Room room = new Room(0, "Starting room", npc);
        room.itemsInRoom.add(die);
        room.investigateRoom();
//        GameUI gameUI = new GameUI();
//        gameUI.roomOption(game.getPlayer());

    }
}