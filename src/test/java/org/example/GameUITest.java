package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;
class GameUITest {

    private Player player;
    private GameUI gameUI;
    private Room room;
    private NPC npc;

    @BeforeEach
    void setUp() {
        player = new Player("Adam");
        player.setCurrentRoom(1);
        gameUI = new GameUI();
        room = new Room(1, "test");
    }

    @Test
    void testRoomOption() {
        //simulerar att användaren väljer val 1 för att flytta fram och 6 för att avsluta
        String input = "1\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        gameUI.roomOption(player);

        assertEquals(2, player.getCurrentRoom());
    }

}