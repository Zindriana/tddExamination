package org.example;

import org.example.models.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ItemTest {

    @Test
    public void testPickUp() {
        Item sword = new Item("Sword");  // Use only the name
        sword.pickUp();
        assertEquals("Sword", sword.getName());
    }

    @Test
    public void testUse() {
        Item shield = new Item("Shield");  // Use only the name
        shield.use();
        assertEquals("Shield", shield.getName());
    }

    @Test
    public void testInvestigateItem() {
        Item sword = new Item("Sword");  // Use only the name
        String expectedDescription = "A sharp, shiny sword."; // Adjust based on your Text class logic
        assertEquals(expectedDescription, sword.getDescription());
        sword.investigateItem(); // You might want to capture output if needed
    }

    @Test
    public void testSettersAndGetters() {
        Item sword = new Item("Sword");  // Use only the name
        sword.setName("Magic Sword");
        sword.setDescription("A magical sword with glowing runes."); // Note: Description won't update from Text
        assertEquals("Magic Sword", sword.getName());
        assertEquals("A magical sword with glowing runes.", sword.getDescription());

    }

    // Additional tests can be added here
}
