package org.example.game;

import org.example.models.Player;

import java.util.Scanner;

public class GameUI {

    private Game game;

    public GameUI(Game game) {
        this.game = game;
    }

    public void roomOption(Player player) {

        Scanner sc = new Scanner(System.in);
        boolean on = true;

        while(on) {
         System.out.println("\nChoose an option: ");
         System.out.println("1. Move forward");
         System.out.println("2. Move backward");
         System.out.println("3. Check backpack");
         System.out.println("4. Investigate room");
         System.out.println("5. Exit");

         String choice = sc.nextLine().trim();

         switch(choice) {
             case "1": //moving forward one room
                 try {  // try catch block för att inte krasha koden när undantaget för att flytta för långt fram kastas
                     player.moveForward();
                 } catch (IllegalStateException e) {
                     System.out.println(e.getMessage());
                 }
                 break;

             case "2": //moving backward one room
                 try {
                     player.moveBack();
                 } catch (IllegalStateException e) {
                     System.out.println(e.getMessage());
                 }
                 break;

             case "3": //checking items in backpack
                 try {
                     player.checkBackpack();
                 } catch (IllegalStateException e) {
                     System.out.println(e.getMessage());
                 }
                 break;

             case "4": //investigate the room
                 game.InvestigateRoomOption();
                 break;

             case "5": //exits the game
                 System.out.println("Are you sure you want to exit the game? (y/n)");
                 String answer = sc.nextLine();
                 if(answer.toLowerCase().equals("y")) {
                     on = false;
                 }
                 break;
             default:
                 break;
         }
        }
    }
}
