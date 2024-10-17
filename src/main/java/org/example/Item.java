import java.util.Objects;

public class Item {
    private final String name;
    private final String description;

    // Constructor that fetches the description from the Text class
    public Item(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Item name cannot be null or empty.");
        }
        this.name = name;
        this.description = Text.getDescriptionForItem(name); // Fetch description based on the name
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Method to investigate the item
    public void investigateItem() {
        System.out.println("You are investigating the item: " + name);
        System.out.println(description != null ? description : "No description available.");
    }

    @Override
    public String toString() {
        return "Item{name='" + name + "', description='" + description + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return name.equals(item.name) && Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
