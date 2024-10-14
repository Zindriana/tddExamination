package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GameTest {

    @Test
    void createGameTest(){
        Player player = mock(Player.class);
        Game game = new Game("David");
        when(player.getName()).thenReturn("David");
        game.getPlayer().getName();

        assertEquals("David", game.getPlayer().getName());

    }

}