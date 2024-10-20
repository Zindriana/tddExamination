package org.example.game;

public class Text {


    //rooms
    public String getRoomDescriptionWhenEnter(String roomName){
        switch(roomName){
            case "Starting room":
                return "You return to the room where you woke up.";
            case "Middle room":
                return "You enter into a very dark cavern";
            case "Third room":
                return " place holder third room";
            case "Last room":
                return " place holder last room";
            default:
                return null;
        }
    }


    public String getRoomDescriptionWhenInvestigate(String roomName){
        switch(roomName){
            case "Starting room":
                return " The room is barely lit by a few candles and you feel a light breeze. " +
                        "You see something small glowing on the dark stone floor among some pebbles.\n " +
                        " You also see a " + getNpcDescription("Hooded figure").toLowerCase() +
                        " standing in the shadows next to a large wooden door. \n " +
                        "It seems like the door is the only way out of here.";

            case "Middle room":
                return " You hear droplets drop on the cavern ground and the stones feel cold against your bare feet.\n" +
                        "the cold breeze that you felt in the previous room is much stronger in here.";
            case "Third room":
                return " place holder third room";
            case "Last room":
                return " place holder last room";
            default:
                return null;
        }
    }

    public String getItemDescription(String itemName){
        switch(itemName){
            case "Die":
                return "A bright white six-sided die. It glows weak in you hand.";
            case "Candle":
                return "A thick white candle. It has been used sometime before.";
            case "Key" :
                return "A golden key";
            case "MagicWand":
                return "A wand imbued with magical powers.";
            case "Sword":
                return "A sharp, shiny sword.";
            default:
                return null;
        }
    }

    // Object that u not can pick up
    public String getObjectDescription(String objectName) {
        switch (objectName){
            case "Bench":
                return "It is just a simple wooden bench. It seems heavy though.";
            case "Large hole":
                return "A large hole in the wall. The hole is to high up on the wall for you\n" +
                        "to be able to investigate it further. But it seems to go to the other room \n" +
                        "and a cold wind is swooshing out of there.";
            case "Circle of candles":
                return "There are some white candles forming a circle around where you woke up.\n" +
                        "They give some light and warmth in this cold and dark dungeon.";
            case "A small shining thing":
                return "\"You see a small shining thing among some stones.\n" +
                        " It is a white bright six sided die that emit a weak light.\n" +
                        " You hear the hooded figure gives away a silent chuckle when\n" +
                        " you put it in your pocket.";
            default:
                return null;
        }

    }
   
    //npc
    public String getNpcDescription(String npcName){
        switch(npcName){
            case "Hooded figure":
                return "mysterious hooded figure";
            case "Another npc":
                return " place holder for npc description in room 2";
            default:
                return null;
        }
    }

    //hints
    public String getRoomHints(String roomName){
        switch(roomName){
            case "Starting room":
                return " this is a place holder for the hint in room 1";
            case "Middle room":
                return " this is a place holder for the hint in room 2";
            case "Third room":
                return " this is a place holder for the hint in room 3";
            case "Last room":
                return " this is a place holder for the hint in room 4";

            default:
                return null;
        }
    }
}
