package org.example.models.items;

public class Candle extends Item{

    private boolean isLit = false;

    public Candle() {
        super("Candle");
    }

    public void use() {
        if (!isLit){
            System.out.println("You lit the candle.");
            isLit = true;
        } else {
            System.out.println("You hold up the candle and spread the light through the room.");
        }

    }

}
