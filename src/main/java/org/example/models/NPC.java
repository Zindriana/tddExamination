package org.example.models;

import org.example.puzzles.PuzzleUtil;
import org.example.puzzles.Puzzles;
import org.example.game.Text;

import java.util.Scanner;

public class NPC {

    private final Scanner sc = new Scanner(System.in);
    private String hint;
    private Puzzles puzzle;
    private String name;
    private String description;
    private final Text output = new Text();

    public NPC(String name) {
        this.name = name;
        this.description = output.getNpcDescription(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void interact(Player player, Room room) {
        System.out.println("The mysterious hooded figure greets you: Hi " + player.getName() + "!");
        boolean isConversationActive = true;
        while(isConversationActive) {
            System.out.println("\n (choose conversation option)");
            System.out.println("1. How do you know my name? Who are you?");
            System.out.println("2. Where am I?");
            System.out.println("3. Why have you brought me here?");
            System.out.println("4. How do I get out of here?");
            System.out.println("5. End conversation");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("I know a lot of things of great value, and, of lesser value.");
                    break;
                case "2":
                    System.out.println("In the deep dungeon of course!");
                    break;
                case "3":
                    System.out.println("To test your skills, mhuahahaha");
                    break;
                case "4":
                    System.out.println("Through this door of course, that's what doors are created for. \n" +
                            "Persistence is the key to this door.");
                    break;
                default:
                    isConversationActive = false;
                    break;
            }
        }
    }
}

