package org.example;

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
        System.out.println("Hi " + player.getName() + "!");
        System.out.println("Choose an option (Enter 1 or 2): ");
        System.out.println("1. Play puzzle ");
        System.out.println("2. Get hint about an item ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                Puzzles p = PuzzleUtil.getPuzzleByRoom(room.getName());
                System.out.println("You are about to play puzzle " + p.getDescription());
                p.solve();
            }
            case 2 -> System.out.println(output.getRoomHints(room.getName()));
        }
    }
}

