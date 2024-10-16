package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class NPCTest {
    private NPC mockNpc;
    private Player mockPlayer;
    private Scanner mockScanner;
    private Random mockRandom;
    private Puzzles mockPuzzle;

    @BeforeEach
    void setup() {
        mockNpc = Mockito.mock(NPC.class);
        mockPlayer = Mockito.mock(Player.class);
        mockScanner = Mockito.mock(Scanner.class);
        mockRandom = Mockito.mock(Random.class);
        mockPuzzle = Mockito.mock(Puzzles.class);

        when(mockPlayer.getName()).thenReturn("TestPlayer");
        when(mockNpc.getName()).thenReturn("TestNpc");
        when(mockNpc.getDescription()).thenReturn("A tall man");
    }

    @Test
    public void test_getName() {
        assertEquals("TestNpc", mockNpc.getName());
    }

    @Test
    public void test_getDescription() {
        assertEquals("A tall man", mockNpc.getDescription());
    }

    @Test
    void test_interact() {
        // TODO
    }


}