package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GameTest {

    @ParameterizedTest
    @CsvSource({
            "'David','Erik'",
            "'','Alice'",
            "' ','Bambina'"
    })
    void createGameTest(String playerName, String reserveName) {
        InputStream originalIn = System.in;

        try {
            String inputName = playerName.trim().isEmpty() ? reserveName : playerName;
            System.setIn(new ByteArrayInputStream(inputName.getBytes()));
            Game game = new Game();
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            game.startGame();


            assertEquals(inputName, game.getPlayer().getName());
            assertEquals(
                    "Choose your name\nHello " + game.getPlayer().getName() +
                            ". Welcome to my dungeon. To get out you need to solve my puzzles!",
                    outContent.toString().trim());
        } finally {
            System.setIn(originalIn);
            System.setOut(System.out);
        }
    }


    @Test
    void getItemTest(){
        Game game = mock(Game.class);
        Item ExpectedItem = mock(Item.class);

        when(game.getItem("Key")).thenReturn(ExpectedItem);

        assertNull(game.getItem("Magical Potion"));
        assertNull(game.getItem(""));
        assertNull(game.getItem(" "));
        assertEquals(ExpectedItem, game.getItem("Key"));
    }

}