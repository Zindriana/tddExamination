package org.example.game;


public class Clue {

    public static boolean[] roomIsInvestigated = new boolean[4];
    public static boolean candleIsLit = true;
    public static boolean benchIsInSecondRoom = false;

    public static void setRoomIsInvestigated(int roomNumber) {
        roomIsInvestigated[roomNumber] = true;
    }

}
