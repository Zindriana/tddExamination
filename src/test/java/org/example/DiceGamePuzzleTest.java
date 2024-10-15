package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DiceGamePuzzleTest {

    @Test
    void testRollHigherThanThree() {
        DiceGamePuzzle puzzle = new DiceGamePuzzle("Roll a dice and try to get higher than 3", 3);

        // Mocking the random number generation
        int mockRoll =2;

        boolean result = puzzle.solveWithMockRoll(mockRoll);

        assertTrue(result, "The player should have rolled higher than 3");
    }
}
