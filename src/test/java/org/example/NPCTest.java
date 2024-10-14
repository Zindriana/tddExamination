package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class NPCTest {
    private NPC npc;

    @BeforeEach
    void setUp() {
        npc = new NPC("Tom");
        npc.setCurrentRoom(1);
        npc.setDescription("npc description");
        System.out.println(npc.getName());
    }


    @Test
    public void test_getName() {
        assertEquals("NPC_Tom", npc.getName());
    }

    @Test
    public void test_getName_withError() {
        assertNotEquals("NPC Tom", npc.getName());
    }

    @Test
    public void test_moveForward() {
        npc.moveForward();
        assertEquals(2, npc.getCurrentRoom());
    }

    @Test
    public void test_moveForwardx3() {
        npc.moveForward();
        npc.moveForward();
        npc.moveForward();
        assertEquals(4, npc.getCurrentRoom());
    }

    @Test
    public void test_moveBackward() {
        npc.moveBack();
        assertEquals(0, npc.getCurrentRoom());
    }

    @Test
    public void test_getDescription() {
        assertEquals("npc description", npc.getDescription());
    }
}