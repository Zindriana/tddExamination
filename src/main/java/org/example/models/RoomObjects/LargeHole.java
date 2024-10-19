package org.example.models.RoomObjects;

import org.example.game.Clue;
import org.example.models.Player;
import org.example.models.Room;

public class LargeHole extends RoomObject{

    public LargeHole() {
        super("Large hole");
    }

    @Override
    public void interactWithObject(Room room, Player player) {
        if(!Clue.benchIsInSecondRoom) {
            System.out.println(getDescription());
        } else if (Clue.benchIsInSecondRoom && !Player.backpack.contains(room.getItem("Lantern"))){
            System.out.println("Player hasn´t the lantern when interacting with the large hole");
            Player.backpack.add(room.getItem("Lantern"));
        } else if (Clue.benchIsInSecondRoom && Player.backpack.contains(room.getItem("Lantern"))) {
            System.out.println("Player has the lantern when interacting with the large hole");
        }
    }


}
