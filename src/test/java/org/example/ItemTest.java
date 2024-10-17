import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void testValidItemCreation() {
        Item sword = new Item("Sword");
        assertEquals("Sword", sword.getName());
        assertEquals("A sharp, shiny sword.", sword.getDescription());
    }

    @Test
    public void testInvalidItemName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Item("");
        });
        assertEquals("Item name cannot be null or empty.", exception.getMessage());
    }

    @Test
    public void testInvestigateItem() {
        Item shield = new Item("Shield");
        assertEquals("A sturdy, protective shield.", shield.getDescription());
    }

    @Test
    public void testUnknownItemDescription() {
        Item unknownItem = new Item("UnknownItem");
        assertEquals("Description not found for the item: UnknownItem", unknownItem.getDescription());
    }
}
