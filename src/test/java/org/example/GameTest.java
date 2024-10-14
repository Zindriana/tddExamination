package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

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
            System.out.println("PlayerName: " + playerName + " ReserveName: " + reserveName);
            String inputName = playerName.trim().isEmpty() ? reserveName : playerName;
            System.out.println("Input Name: " + inputName);
            System.setIn(new ByteArrayInputStream(inputName.getBytes()));
            Game game = new Game();
            game.startGame();

            System.out.println(game.getPlayer().getName());
            assertEquals(inputName, game.getPlayer().getName());
        } finally {
            System.setIn(originalIn);
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