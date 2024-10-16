package org.example;

public class Item {

    // Attributes for item name and description
    private String name;
    private String description;
    private final Text output = new Text();

    // Constructor for creating an Item object, now fetching description from Text class
    public Item(String name) {
        this.name = name;
        this.description = output.getItemDescription(name); // Use name for fetching description
    }

    // Method to pick up the item
    public void pickUp() {
        System.out.println("You have picked up: " + name);
        // Logic for adding the item to the player's inventory
    }

    // Method to use the item
    public void use() {
        System.out.println("You have used the " + name);
        // Logic for what happens when the item is used
    }

    // Method to investigate the item
    public void investigateItem() {
        System.out.println("You investigate the " + name + ". " + description);
    }

    // Getters for name and description
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Setters for name and description
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
