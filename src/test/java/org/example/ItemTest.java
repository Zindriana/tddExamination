package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void testPickUp() {
        Item sword = new Item("Sword", "A sharp, shiny sword.");
        sword.pickUp();
        assertEquals("Sword", sword.getName());
    }

    @Test
    public void testUse() {
        Item shield = new Item("Shield", "A sturdy wooden shield.");
        shield.use();
        assertEquals("Shield", shield.getName());
    }

    @Test
    public void testInvestigateItem() {
        Item sword = new Item("Sword", "A sharp, shiny sword.");
        sword.investigateItem();
        assertEquals("A sharp, shiny sword.", sword.getDescription());
    }

    @Test
    public void testSettersAndGetters() {
        Item sword = new Item("Sword", "A sharp, shiny sword.");
        sword.setName("Magic Sword");
        sword.setDescription("A magical sword with glowing runes.");
        assertEquals("Magic Sword", sword.getName());
        assertEquals("A magical sword with glowing runes.", sword.getDescription());
    }
}
