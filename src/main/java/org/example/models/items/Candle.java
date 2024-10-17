package org.example.models.items;

public class Candle extends Item{

    private boolean isLit = false;

    public Candle() {
        super("Candle");
    }

    @Override
    public void use() {
        if (!isLit && getCurrentRoom() == 0){
            System.out.println("You lit the candle.");
            isLit = true;
        } else if (isLit && getCurrentRoom() == 1){
            System.out.println("You use the candle to get some light in the dark cavern, \n " +
                    "the light flickers wild in the cold breeze and \n" +
                    "you try to protect the small flame with your hand, but in wane.\n" +
                    "It became really dark in the room once more...");
            isLit = false;
        } else if (!isLit){
            System.out.println("You need to find a way to lit the candle.");
        } else {
            System.out.println("You hold up the candle and spread the light through the room.");
        }

    }

}
