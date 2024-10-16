package org.example;

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
    String expectedDescription = "A sharp, shiny sword."; // Expected description
    assertEquals(expectedDescription, sword.getDescription());

    // Capture the output from investigateItem
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    sword.investigateItem(); 

    // Restore the original System.out
    System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

    // Verify output
    String expectedOutput = "You investigate the Sword. A sharp, shiny sword.";
    assertEquals(expectedOutput, outputStream.toString().trim());
}

    @Test
    public void testSettersAndGetters() {
        Item sword = new Item("Sword");  // Use only the name
        sword.setName("Magic Sword");
        sword.setDescription("A magical sword with glowing runes."); // Note: Description won't update from Text
        assertEquals("Magic Sword", sword.getName());
        assertEquals("A magical sword with glowing runes.", sword.getDescription());
    }
}
