package org.example.models.RoomObjects;

import org.example.game.Clue;
import org.example.models.Player;
import org.example.models.Room;

import java.util.Scanner;

public class Bench extends RoomObject{

    private int isInRoom = 0;
    private Scanner sc = new Scanner(System.in);

    public Bench() {
        super("Bench");
    }

    @Override
    public void interactWithObject(Room room){
        if(!Clue.roomIsInvestigated[1] && isInRoom == 0){
            System.out.println(getDescription());
        } else {
            System.out.println("It is heavy but you think you can move it to the other room to reach higher.\n" +
                    "Do you try to move it? (y/n)");
            String answer = sc.nextLine();
            if(answer.equals("y")){
                System.out.println("You drag it slowly to the other room. You feel a little bit exhausted.");
                isInRoom = 1;
                System.out.println("You walk back to the first to get your backpack.");
                room.objectsInRoom.remove(room.getRoomObject("Bench"));
                room.objectsInRoom.add(room.getRoomObject("Bench"));
                //setRoomDescription
            }
        }
        if (isInRoom == 1){
            System.out.println("You pull the bench and place it below the hole in the wall\n" +
                    "You stand up on the bench and look into the big hole. A strong freezing wind\n" +
                    "blows in your face. The first thing you see is an empty lantern and \n" +
                    "wondering how it ended up here.\n" +
                    "The light from the die reach to the other room that seems to be \n" +
                    "full of ice and blue frozen walls.\n");

        }
    }
}
