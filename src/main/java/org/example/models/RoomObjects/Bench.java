package org.example.models.RoomObjects;

import org.example.game.Clue;
import org.example.models.Player;
import org.example.models.Room;
import org.example.models.items.Lantern;

import java.util.Scanner;

public class Bench extends RoomObject{

    private int isInRoom = 0;
    private final Scanner sc = new Scanner(System.in);

    public Bench() {
        super("Bench");
    }


    @Override
    public void interactWithObject(Room room, Player player) {
        if(!Clue.roomIsInvestigated[1] && isInRoom == 0){
            System.out.println(getDescription());
        } else if(Clue.roomIsInvestigated[1] && isInRoom == 0) {
            System.out.println("It is heavy, but you think you can move it to the other room to reach higher.\n" +
                    "Do you try to move it? (y/n)");
            String answer = sc.nextLine();
            if(answer.equals("y")){
                room.setDescriptionOnInvestigateRoom(" rummet utan bänk");
                System.out.println("You drag it slowly to the other room. You feel a little bit exhausted.");
                isInRoom = 1;
                Clue.benchIsInSecondRoom = true;
                RoomObject bench = room.getRoomObject("Bench");
                room.objectsInRoom.remove(room.getRoomObject("Bench"));
                player.setCurrentRoom(1);
                player.getRoom().objectsInRoom.add(bench);
                room = player.getRoom();
                room.setDescriptionOnInvestigateRoom(" rummet med bänk");

            }
        } else if(isInRoom == 1 && !Player.backpack.contains(room.getItem("Lantern"))) {
            System.out.println("""
                    You pull the bench and place it below the opening in the wall
                    You stand up on the bench and look into the big hole. A strong freezing wind
                    hits you in the face. The first thing you see is an empty lantern and\s
                    wondering how it ended up here.
                    The light from the die reach to the other room that seems to be\s
                    full of ice and blue frozen walls.
                    You take the lantern with you down.
                    """);
            Player.backpack.add(new Lantern());
        } else if(Clue.roomIsInvestigated[1] && isInRoom == 1 && Player.backpack.contains(room.getItem("Lantern"))){
            System.out.println("The bench is now cold to touch and you don´t want to drain your stamina on moving it again.");
        }
    }
}
