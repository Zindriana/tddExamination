package org.example.models.RoomObjects;

import org.example.game.Clue;
import org.example.models.Player;
import org.example.models.Room;

public class CircleOfCandles extends RoomObject{

    public CircleOfCandles() {
        super("Circle of Candles");
    }

    @Override
    public void interactWithObject(Room room, Player player) {
        if(!Player.backpack.contains(room.getItem("Candle"))) {
            System.out.println("\"There are some white candles forming a circle around where you woke up.\n" +
                    "They give some light and warmth in this cold and dark dungeon.\n" +
                    "It would probably be wise to take on of them with you");
            Player.backpack.add(room.getItem("Candle"));

        } else if (Clue.candleIsLit) {
            System.out.println("You rest for a moment near the candles.\n" +
                    "Warming yourself the best you can before continuing your \n" +
                    "escape from this dreaded place.");
        } else if(!Clue.candleIsLit) {
            System.out.println("You warm your hands for a moment, before you lit your candle once again.");
            Clue.candleIsLit = true;
        }
    }
}
