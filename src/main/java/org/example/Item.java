package org.example;

public class Item {
    private String name;
    private String description;

    // Constructor that fetches the description from the Text class
    public Item(String name, Text text) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be null or empty.");
        }
        this.name = name;
        this.description = text.getItemDescription(name);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Example method to investigate the item
    public String investigate() {
        return getDescription();
    }
}
