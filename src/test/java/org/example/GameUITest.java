package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;
class GameUITest {

    private Player player;
    private GameUI gameUI;
    private Room room;

    @BeforeEach
    void setUp() {
        player = new Player("Adam");
        player.setCurrentRoom(1);
        gameUI = new GameUI();
        room = new Room();
    }

    @Test
    void testRoomOption() {
        //simulerar att användaren väljer val 1 för att flytta fram och 4 för att avsluta
        String input = "1\n4\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        gameUI.roomOption(player, room);

        assertEquals(2, player.getCurrentRoom());
    }

}