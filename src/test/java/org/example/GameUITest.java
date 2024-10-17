package org.example;

import org.example.game.Game;
import org.example.game.GameUI;
import org.example.models.Player;
import org.example.models.Room;
import org.example.db.Building;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;
class GameUITest {

    private Player player;
    private GameUI gameUI;
    private Room room;
    private final Building building = new Building();
    private final Game game = new Game();

    @BeforeEach
    void setUp() {
        player = new Player("Adam", building);
        player.setCurrentRoom(1);
        gameUI = new GameUI(game);
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