package org.example.game;

public class Text {


    //rooms
    public String getRoomDescriptionWhenEnter(String roomName){
        switch(roomName){
            case "Starting room":
                return "You return to the starting room";
            case "Middle room":
                return "You enter a dark cavern";
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
                        "You see something bright and small on the dark stone floor.\n " +
                        "It is " + getItemDescription("Die").toLowerCase() +
                        " You also see a " + getNpcDescription("Hooded figure").toLowerCase() +
                        " \nstanding next to a large wooden door. It seems like the door is the only way out of here. ";

            case "Middle room":
                return " You hear droplets drop on the cavern ground and the stones feel cold against your bare feet";
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
                return "A bright white six-sided die.";
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
