package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PlayerTest {

    private Player player;
    private Player player2;
    private Player player3;
    private Building building;


    @BeforeEach
    void setUp() {
        player = new Player("Adam", building);
        player.setCurrentRoom(1);

        player2 = new Player("Lorem", building);
        player2.setCurrentRoom(3);

        player3 = new Player("Ipsum", building);
        player3.setCurrentRoom(0);
    }

    @Test
    public void testGetName() {
        assertEquals("Adam", player.getName());
    }

    @Test
    public void testMoveForward() {
        player.moveForward();
        assertEquals(2, player.getCurrentRoom());

        Exception exception = assertThrows(IllegalStateException.class, () -> player2.moveForward());
        assertEquals("You cant move forward, room 3 is the last room\n", exception.getMessage());
    }

    @Test
    public void testMoveBackward() {
        player.moveBack();
        assertEquals(0, player.getCurrentRoom());

        Exception exception = assertThrows(IllegalStateException.class, () -> player3.moveBack());
        assertEquals("You cant move back, room 0 is the first room\n", exception.getMessage());
    }

    @Test
    public void testCheckBackpack() {
        Item mockItem = mock(Item.class); //mockar Item klassen
        Item mockItem2 = mock(Item.class);
        when(mockItem.getName()).thenReturn("Mocked sword"); //sätter getName från mockade item till "Mocked item"
        when(mockItem2.getName()).thenReturn("Mocked shield");

        player.backpack.add(mockItem); //addar "Mocked sword" till förta platsen i ryggsäcken
        player.backpack.add(mockItem2);
        mockItem.use();

        assertEquals("Mocked sword", player.backpack.get(0).getName());
        assertEquals("Mocked shield", player.backpack.get(1).getName());
        verify(mockItem).use();

    }

    @Test
    public void testCheckBackpackEmpty() {
        //testar att metoden kastar felmeddelande när ryggsäcken är tom
        Exception exception = assertThrows(IllegalStateException.class, () -> player.checkBackpack());

        assertEquals("There are no items in the backpack\n", exception.getMessage());
    }

}