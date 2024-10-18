package org.example.game;

import java.util.ArrayList;
import java.util.List;

public class Clue {

    public static boolean[] roomIsInvestigated = new boolean[4];

    public static void setRoomIsInvestigated(int roomNumber) {
        roomIsInvestigated[roomNumber] = true;
    }
}
