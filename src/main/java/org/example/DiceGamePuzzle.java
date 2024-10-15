package org.example;

import java.util.Random;
import java.util.Scanner;

public class DiceGamePuzzle extends Puzzles {
    private int targetNumber;
    private static final int MIN_ROLL = 3;

    public DiceGamePuzzle(String description, int targetNumber) {
        super(description);
        this.targetNumber = targetNumber;
    }

    @Override
    public boolean solve() {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int roll;

        // Loop until the player rolls a 3 or higher
        do {
            System.out.println(getDescription());
            System.out.println("Press Enter to roll the dice...");
            scanner.nextLine();

            roll = rand.nextInt(6) + 1;  // Dice roll between 1 and 6
            System.out.println("You rolled a " + roll);

            if (roll < 3) {
                System.out.println("You rolled less than 3. Try again!");
            }
        } while (roll < 3);

        if (roll > targetNumber) {
            System.out.println("Congratulations! You rolled higher than " + targetNumber);
            return true;
        } else {
            System.out.println("Sorry, you rolled less than or equal to " + targetNumber);
            return false;
        }
    }
    public boolean solveWithMockRoll(int mockRoll) {
        // If mockRoll is less than 1 or more than 6, it's invalid
        if (mockRoll < 1 || mockRoll > 6) {
            throw new IllegalArgumentException("Mock roll must be between 1 and 6");
        }

        System.out.println(getDescription());
        System.out.println("Mock roll value is " + mockRoll);

        // Check if the roll is lower than the minimum required
        if (mockRoll < MIN_ROLL) {
            System.out.println("You rolled less than " + MIN_ROLL + ". Try again!");
            return false;
        }

        // Check if the roll is higher than the target number
        if (mockRoll > targetNumber) {
            System.out.println("Congratulations! You rolled higher than " + targetNumber);
            return true;
        } else {
            System.out.println("Sorry, you rolled less than or equal to " + targetNumber);
            return false;
        }
    }
}