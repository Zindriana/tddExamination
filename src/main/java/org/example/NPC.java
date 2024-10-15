package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NPC {

    private final Scanner sc = new Scanner(System.in);
    private final List<String> hints = new ArrayList<>();
    private final List<Puzzles> puzzles = new ArrayList<>();
    private String name;
    private String description;
    private Random random;


    public NPC() {
        addHints();
        addPuzzles();
    }

    public NPC(String name, String description) {
        this.name = name;
        this.description = description;
        addHints();
        addPuzzles();
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


    public void interact(Player player) {
        System.out.println("Hi " + player.getName() + "!");
        System.out.println("Choose an option (Enter 1 or 2): ");
        System.out.println("1. Play puzzle ");
        System.out.println("2. Get hint about an item ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                Puzzles p = getRandomPuzzle();
                System.out.println("You are about to play puzzle " + p.getDescription());
                p.solve();
            }
            case 2 -> System.out.println(getRandomHint());
        }
    }

    private void addHints() {
        hints.add("Look under the bed");
        hints.add("Look behind the door");
        hints.add("Pick up the book from the floor");
    }

    private String getRandomHint() {
        random = new Random();
        int randomIndex = random.nextInt(hints.size());
        return hints.get(randomIndex);
    }

    private void addPuzzles() {
        puzzles.add(new DiceGamePuzzle("DiceGamePuzzle", 12, random));
        puzzles.add(new MathQuestionPuzzle("MathQuestionPuzzle"));
    }

    private Puzzles getRandomPuzzle() {
        random = new Random();
        int randomIndex = random.nextInt(puzzles.size());
        return puzzles.get(randomIndex);
    }

}

