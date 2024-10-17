package org.example.models.items;

import java.util.Random;

public class Die extends Item {

    private int totalDieValue = 0;
    private final Random rand = new Random();

    public Die() {
        super("Die");
    }

    @Override
    public void use(){
        int dieRoll = rand.nextInt(5) + 2;
        totalDieValue += dieRoll;
        System.out.println("You throw the six sided die on the floor and it face you with " + dieRoll + "dots.\n" +
                "It´s light starts to bright stronger.");
    }

    public int getTotalDieValue(){
        return totalDieValue;
    }

}
