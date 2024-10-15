package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class DiceGamePuzzleTest {

    @Test
    void testRollHigherThanThree() {
        DiceGamePuzzle puzzle = new DiceGamePuzzle("Roll a dice and try to get higher than 3", 3);

        // Mocking the random number generation
        int mockRoll =4;

        boolean result = puzzle.solveWithMockRoll(mockRoll);

        assertTrue(result, "The player should have rolled higher than 3");
    }

    @Test
    void testRollLowerOrEqualToThree() {
        DiceGamePuzzle puzzle = new DiceGamePuzzle("Roll a dice and try to get higher than 3", 3);

        int mockRoll = 2;

        boolean result = puzzle.solveWithMockRoll(mockRoll);

        assertFalse(result, "The player should not have won with a roll less than or equal to 3");
    }
}
