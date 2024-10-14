package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GameTest {

    @Test
    void createGameTest(){

        String input = "David\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Game game = new Game();
        game.startGame();

        assertEquals("David", game.getPlayer().getName());

    }

}