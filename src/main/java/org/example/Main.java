package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the puzzle game!");

        // Create a new MathQuestionPuzzle
        MathQuestionPuzzle mathPuzzle = new MathQuestionPuzzle("Solve the following math problem:");

        boolean result = mathPuzzle.solve();

        if (result) {
            System.out.println("You solved the math puzzle!");
        } else {
            System.out.println("You failed the math puzzle.");
        }
    }
}
