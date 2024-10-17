package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
    
    private Text mockText() {
        return new Text() {
            @Override
            public String getItemDescription(String name) {
                switch (name) {
                    case "Sword":
                        return "A sharp, shiny sword.";
                    case "Shield":
                        return "A sturdy, protective shield.";
                    default:
                        return "Description not found for the item: " + name;
                }
            }
        };
    }

    @Test
    public void testValidItemCreation() {
        Item sword = new Item("Sword", mockText());
        assertEquals("Sword", sword.getName());
        assertEquals("A sharp, shiny sword.", sword.getDescription());
    }

    @Test
    public void testInvalidItemName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Item("", mockText());
        });
        assertEquals("Item name cannot be null or empty.", exception.getMessage());
    }

    @Test
    public void testInvestigateItem() {
        Item shield = new Item("Shield", mockText());
        assertEquals("A sturdy, protective shield.", shield.getDescription());
    }

    @Test
    public void testUnknownItemDescription() {
        Item unknownItem = new Item("UnknownItem", mockText());
        assertEquals("Description not found for the item: UnknownItem", unknownItem.getDescription());
    }
}
