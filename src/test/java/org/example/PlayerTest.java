package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
        Item mockItem = mock(Item.class); //mockar Item klassen
        Item mockItem2 = mock(Item.class);
        when(mockItem.getName()).thenReturn("Mocked sword"); //sätter getName från mockade item till "Mocked item"
        when(mockItem2.getName()).thenReturn("Mocked shield");

        player.backpack.add(mockItem); //addar "Mocked sword" till förta platsen i ryggsäcken
        player.backpack.add(mockItem2);

        assertEquals("Mocked sword", player.backpack.get(0).getName());
        assertEquals("Mocked shield", player.backpack.get(1).getName());
    }

    @Test
    public void testCheckBackpackEmpty() {
        //testar att metoden kastar felmeddelande när ryggsäcken är tom
        Exception exception = assertThrows(IllegalStateException.class, () -> player.checkBackpack());

        assertEquals("There are no items in the backpack", exception.getMessage());
    }

}