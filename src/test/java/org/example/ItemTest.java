package org.example;

import org.junit.jupiter.api.Test;  // Se till att importera JUnit 5
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void testPickUp() {
        Item sword = new Item("Sword");
        sword.pickUp();
        assertEquals("Sword", sword.getName());
    }

    @Test
    public void testUse() {
        Item shield = new Item("Shield");
        shield.use();
        assertEquals("Shield", shield.getName());
    }

    @Test
    public void testInvestigateItem() {
        Item sword = new Item("Sword");
        String expectedDescription = "A sharp, shiny sword.";  // Justera efter Text-klassen
        assertEquals(expectedDescription, sword.getDescription());
        sword.investigateItem();
    }

    @Test
    public void testSettersAndGetters() {
        Item sword = new Item("Sword");
        sword.setName("Magic Sword");
        sword.setDescription("A magical sword with glowing runes.");
        assertEquals("Magic Sword", sword.getName());
        assertEquals("A magical sword with glowing runes.", sword.getDescription());
    }
}
