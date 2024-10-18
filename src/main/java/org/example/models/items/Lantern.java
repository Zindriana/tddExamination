package org.example.models.items;

import org.example.models.Player;
import org.example.models.Room;

public class Lantern extends Item {

    private boolean lanternHasCandle = false;

    public Lantern() {
        super("Lantern");
    }

    @Override
    public void use(Room room){
        if(Player.backpack.contains(Player.getItem("Candle"))){
            lanternHasCandle = true;
            System.out.println("You put the candle in the lantern.");
        } else {
            System.out.println("You have nothing to put in the lantern.");
        }
    }
}
