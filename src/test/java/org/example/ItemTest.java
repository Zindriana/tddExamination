package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {

    @Test
    public void testItemCreation() {
        Item sword = new Item("Sword", "A sharp blade used for combat.");
        assertEquals("Sword", sword.getName());
        assertEquals("A sharp blade used for combat.", sword.getDescription());
    }

    @Test
    public void testSetters() {
        Item sword = new Item("Sword", "A sharp blade used for combat.");
        sword.setName("Long Sword");
        sword.setDescription("A longer blade used for combat.");
        assertEquals("Long Sword", sword.getName());
        assertEquals("A longer blade used for combat.", sword.getDescription());
    }
}
