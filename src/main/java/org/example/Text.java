package org.example;

public class Text {

    //items
    private final String die = " A bright white six-sided die. ";

    //npc
    private String HoodedFigure = " ";

    //rooms
    private String startingRoomEnter = "You return to the starting room";
    private String startingRoomWhenInvestigate = " The room is barely lit by a few candles and you feel a light breeze. " +
            "You see something bright and small on the dark stone floor. It is " + getItemDescription(die) +
            " You also see a hooded figure standing next to a large wooden door. It seems like the door is the only way out of here. ";
    private String middleRoomEnter = "You enter a dark cavern";
    private String middleRoomWhenInvestigate = " You hear droplets drop on the floor and floor is cold against your bare feet";

    public String getRoomEnterDescription(String roomName){
        return roomName;
    }

    public String getRoomInvestigateDescription(String roomName){
        return roomName;
    }


    public String getItemDescription(String itemName){
        return itemName;
    }


    public String getNpcDescription(String npcName){
        return npcName;
    }
}
