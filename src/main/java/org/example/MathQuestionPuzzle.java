package org.example;

import java.util.Random;
import java.util.Scanner;

public class MathQuestionPuzzle extends Puzzles {
    private int number1;
    private int number2;

    public MathQuestionPuzzle(String description) {
        super(description);
        Random random = new Random();
        this.number1 = random.nextInt(100) + 1;
        this.number2 = random.nextInt(100) + 1;
    }

    // Getter methods
    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    @Override
    public boolean solve() {
        Scanner scanner = new Scanner(System.in);
        boolean solved = false;

        while (!solved) {
            System.out.println(description);
            System.out.println("What is " + number1 + " + " + number2 + "?");

            int answer = scanner.nextInt();

            if (answer == (number1 + number2)) {
                System.out.println("Correct!");
                solved = true;
            } else {
                System.out.println("Incorrect. Please try again.");
            }
        }

        return solved;
    }

    // Method to simulate solving with a mock answer
    public boolean solveWithMockAnswer(int answer) {
        return answer == (number1 + number2);
    }
}
