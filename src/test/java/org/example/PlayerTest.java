package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player("Adam");
        player.setCurrentRoom(1);
    }

    @Test
    public void testGetName() {
        assertEquals("Adam", player.getName());
    }

    @Test
    public void testMoveForward() {
        player.moveForward();
        assertEquals(2, player.getCurrentRoom());
    }

    @Test
    public void testMoveBackward() {
        player.moveBack();
        assertEquals(0, player.getCurrentRoom());
    }

    @Test
    public void testCheckBackpack() {
    }

}