package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class MathQuestionPuzzleTest {

    @Test
    void testRandomNumberGeneration() {
        MathQuestionPuzzle puzzle = new MathQuestionPuzzle("Solve the math question.");

        // Check that both numbers are within the range 1 to 100
        assertTrue(puzzle.getNumber1() >= 1 && puzzle.getNumber1() <= 100,
                "number1 is out of range: " + puzzle.getNumber1());
        assertTrue(puzzle.getNumber2() >= 1 && puzzle.getNumber2() <= 100,
                "number2 is out of range: " + puzzle.getNumber2());
    }

    @Test
    void testCorrectAnswer() {
        MathQuestionPuzzle puzzle = new MathQuestionPuzzle("Solve the math question.");
        int correctAnswer = puzzle.getNumber1() + puzzle.getNumber2();

        boolean result = puzzle.solveWithMockAnswer(correctAnswer);

        assertTrue(result, "The answer should be correct.");
    }

    @Test
    void testIncorrectAnswer() {
        MathQuestionPuzzle puzzle = new MathQuestionPuzzle("Solve the math question.");
        int incorrectAnswer = puzzle.getNumber1() + puzzle.getNumber2() - 1; // subtract 1 to make it incorrect

        boolean result = puzzle.solveWithMockAnswer(incorrectAnswer);

        assertFalse(result, "The answer should be incorrect.");
    }
}
