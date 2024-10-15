package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class MathQuestionPuzzleTest {

    @Test
    void testRandomNumberGeneration() {
        MathQuestionPuzzle puzzle = new MathQuestionPuzzle("Solve the math question.");

        // Check that both numbers are within the range 1 to 100
        assertTrue(puzzle.number1 >= 1 && puzzle.number1 <= 100, "number1 is out of range: " + puzzle.number1);
        assertTrue(puzzle.number2 >= 1 && puzzle.number2 <= 100, "number2 is out of range: " + puzzle.number2);
    }

    @Test
    void testCorrectAnswer() {
        MathQuestionPuzzle puzzle = new MathQuestionPuzzle("Solve the math question.");

        // Simulate a correct answer
        int correctAnswer = puzzle.number1 + puzzle.number2;

        boolean result = puzzle.solveWithMockAnswer(correctAnswer);

        assertTrue(result, "The answer should be correct.");
    }

    @Test
    void testIncorrectAnswer() {
        MathQuestionPuzzle puzzle = new MathQuestionPuzzle("Solve the math question.");

        // Simulate an incorrect answer by subtracting 1
        int incorrectAnswer = puzzle.number1 + puzzle.number2 - 1;

        boolean result = puzzle.solveWithMockAnswer(incorrectAnswer);

        assertFalse(result, "The answer should be incorrect.");
    }
}
