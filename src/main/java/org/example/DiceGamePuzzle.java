package org.example;

import java.util.Random;
import java.util.Scanner;

public class DiceGamePuzzle extends Puzzles {
    private int targetNumber;

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
        } while (roll < 3); // Continue rolling until the roll is 3 or higher

        // Check if the final roll is higher than the target number
        if (roll > targetNumber) {
            System.out.println("Congratulations! You rolled higher than " + targetNumber);
            return true;
        } else {
            System.out.println("Sorry, you rolled less than or equal to " + targetNumber);
            return false;
        }
    }
}