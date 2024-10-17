package org.example.models.items;

import org.example.models.Room;

public class Candle extends Item{

    private boolean isLit = true;

    public Candle() {
        super("Candle");
    }

    @Override
    public void use(Room room) {
        if (!isLit && room.getRoomNumber() == 0){
            System.out.println("You lit the candle.");
            isLit = true;
            setDescription("A thick white candle with a small but bright flame.");
        } else if (isLit && room.getRoomNumber() == 1){
            System.out.println("You use the candle to get some light in the dark cavern, \n " +
                    "the light flickers wild in the cold breeze and \n" +
                    "you try to protect the small flame with your hand, but in wane.\n" +
                    "It became really dark in the room once more...");
            isLit = false;
            setDescription("A thick white candle. It has been used sometime before, but is not lit at the moment.");
        } else if (!isLit){
            System.out.println("You need to find a way to lit the candle.");
        } else {
            System.out.println("You hold up the candle and spread the light through the room.");
        }

    }

}
