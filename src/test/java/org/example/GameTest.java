package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GameTest {

    @Test
    void createGameTest(){
        Game game = new Game();
        Player player1 = mock(Player.class);
        game.startGame();
        when(player1.getName()).thenReturn("David");

        assertEquals("David", game.getPlayer().getName());

    }

}