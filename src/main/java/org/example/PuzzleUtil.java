package org.example;

import java.util.Random;

public class PuzzleUtil {

    private static Random random;

    public static Puzzles getPuzzleByRoom(String roomName) {
        switch (roomName) {
            case "Starting room":
                return new DiceGamePuzzle("DiceGamePuzzle", 12, random);
            case "Middle room":
                return new MathQuestionPuzzle("MathQuestionPuzzle");
            case "Third room":
                return null;
            case "Last room":
                return null;
            default:
                return null;
        }
    }
}
