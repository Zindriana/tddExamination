package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void testPickUp() {
        Item sword = new Item("Die");  // Använder namnet "Die" som finns i Text-klassen
        sword.pickUp();
        assertEquals("Die", sword.getName());
    }

    @Test
    public void testUse() {
        Item shield = new Item("magicWand");  // Använder namnet "magicWand" från Text-klassen
        shield.use();
        assertEquals("magicWand", shield.getName());
    }

    @Test
    public void testInvestigateItem() {
        Item die = new Item("Die");  // Använder namnet "Die"
        String expectedDescription = "A bright white six-sided die."; // Den förväntade beskrivningen från Text-klassen
        assertEquals(expectedDescription, die.getDescription());
        die.investigateItem(); // Du kan fånga utskriften om det behövs
    }

    @Test
    public void testSettersAndGetters() {
        Item sword = new Item("Die");  // Använder namnet "Die"
        sword.setName("magicWand"); // Uppdaterar namnet och beskrivningen ska också ändras
        assertEquals("magicWand", sword.getName());
        assertEquals("A wand imbued with magical powers.", sword.getDescription()); // Beskrivningen från Text-klassen
    }
}
