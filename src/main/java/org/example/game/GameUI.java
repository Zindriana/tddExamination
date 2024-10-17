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

         String choice = sc.nextLine();

         switch(choice) {
             case "1":
                 try {  // try catch block för att inte krasha koden när undantaget för att flytta för långt fram kastas
                     player.moveForward();
                 } catch (IllegalStateException e) {
                     System.out.println(e.getMessage());
                 }
                 break;

             case "2":
                 try {
                     player.moveBack();
                 } catch (IllegalStateException e) {
                     System.out.println(e.getMessage());
                 }
                 break;

             case "3":
                 try {
                     player.checkBackpack();
                 } catch (IllegalStateException e) {
                     System.out.println(e.getMessage());
                 }
                 break;

             case "4":
                 game.InvestigateRoomOption();
                 break;

             case "5":
                 on = false;
                 break;
             default:
                 break;
         }
        }
    }
}
