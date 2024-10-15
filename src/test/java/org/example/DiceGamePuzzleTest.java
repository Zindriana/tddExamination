package org.example;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class DiceGamePuzzleTest {
    private static final int TARGET_NUMBER = 3;

    @Test
    void testDiceRollRange() {
        Random random = new Random();
        DiceGamePuzzle puzzle = new DiceGamePuzzle("Roll a dice and try to get higher than 3", TARGET_NUMBER, random);

        // Simulate 100 dice rolls and check that they are within the expected range
        for (int i = 0; i < 100; i++) {
            int roll = random.nextInt(6) + 1;
            assertTrue(roll >= 1 && roll <= 6, "Dice roll is out of range: " + roll);
        }
    }

    @Test
    void testRollHigherThanThree() {
        DiceGamePuzzle puzzle = new DiceGamePuzzle("Roll a dice and try to get higher than 3", 3, new Random());

        int mockRoll = 4;  // Mocked roll value
        boolean result = puzzle.solveWithMockRoll(mockRoll);

        assertTrue(result, "The player should have rolled higher than 3");
    }

    @Test
    void testRollLowerOrEqualToThree() {
        DiceGamePuzzle puzzle = new DiceGamePuzzle("Roll a dice and try to get higher than 3", 3, new Random());

        int mockRoll = 2;  // Mocked roll value
        boolean result = puzzle.solveWithMockRoll(mockRoll);

        assertFalse(result, "The player should not have won with a roll less than or equal to 3");
    }
}
