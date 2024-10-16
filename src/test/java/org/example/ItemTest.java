package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemTest {

    private Text textMock;

    @BeforeEach
    public void setUp() {
        textMock = new Text() {
            @Override
            public String getItemDescription(String descriptionKey) {
                // Mock the descriptions for testing
                if ("magicWand".equals(descriptionKey)) {
                    return "A powerful wand that casts spells.";
                }
                return null; // or a default description if needed
            }
        };
    }

    @Test
    public void testItemCreationWithDescription() {
        // Given: A known description key
        String itemName = "Magic Wand";
        String descriptionKey = "magicWand"; // Ensure this key is used in the Item class

        // When: An item is created
        Item item = new Item(itemName, descriptionKey);

        // Then: The item should have the correct name and a non-empty description
        assertEquals(itemName, item.getName());
        assertNotNull(item.getDescription()); // Ensure this method returns a valid description
        assertFalse(item.getDescription().isEmpty());
    }

    // Additional tests can be added here
}
