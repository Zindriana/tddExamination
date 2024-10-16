package org.example;

public class Text {

    //rooms
    public String getRoomDescriptionWhenEnter(String roomName){
        switch(roomName){
            case "Starting room":
                return "You return to the starting room";
            case "Middle room":
                return "You enter a dark cavern";
            default:
                return null;
        }
    }

    public String getRoomDescriptionWhenInvestigate(String roomName){
        switch(roomName){
            case "Starting room":
                return " The room is barely lit by a few candles and you feel a light breeze. " +
                        "You see something bright and small on the dark stone floor. It is " + getItemDescription("Die") +
                        " You also see a " + getNpcDescription("hooded figure") +  " standing next to a large wooden door. It seems like the door is the only way out of here. ";
            case "Middle room":
                return " You hear droplets drop on the cavern ground and the stones feel cold against your bare feet";
            default:
                return null;
        }
    }


    //items
    public String getItemDescription(String itemName){
        switch(itemName){
            case "Die":
                return "A bright white six-sided die.";
            case "Placeholder item 2":
                return " place holder for item 2 description";
            default:
                return null;
        }
    }

    //npc
    public String getNpcDescription(String npcName){
        switch(npcName){
            case "hooded figure":
                return "mysterious hooded figure";
            case "Middle room":
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
