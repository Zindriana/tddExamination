package org.example;

import java.util.Scanner;

public class GameUI {

    public void roomOption(Player player) {

        Scanner sc = new Scanner(System.in);
        boolean on = true;

        while(on) {
         System.out.println("Choose an option: ");
         System.out.println("1. Move forward");
         System.out.println("2. Move backward");
         System.out.println("3. Check backpack");
         System.out.println("4. Investigate room");
         System.out.println("5. Exit");

         int choice = sc.nextInt();

         switch(choice) {
             case 1:
                 try {  // try catch block för att inte krasha koden när undantaget för att flytta för långt fram kastas
                     player.moveForward();
                 } catch (IllegalStateException e) {
                     System.out.println(e.getMessage());
                 }
                 break;

             case 2:
                 try {
                     player.moveBack();
                 } catch (IllegalStateException e) {
                     System.out.println(e.getMessage());
                 }
                 break;

             case 3:
                 try {
                     player.checkBackpack();
                 } catch (IllegalStateException e) {
                     System.out.println(e.getMessage());
                 }
                 break;

             case 4:
                 player.getRoom().investigateRoom();
                 break;

             case 5:
                 on = false;
         }
        }
    }
}
