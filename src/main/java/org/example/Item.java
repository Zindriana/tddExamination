package org.example;

public class Item {
 
    private String name;
    private String description;

    // Constructor for creating an Item object with a description from Text
    public Item(String name) {
        this.name = name;
        this.description = new Text().getItemDescription(name); // Assume you have a method to get the description
    }

    // Method to pick up the item
    public void pickUp() {
        System.out.println("You have picked up: " + name);
    }

    // Method to use the item
    public void use() {
        System.out.println("You have used the " + name);
    }

    // Method to investigate the item
    public void investigateItem() {
        System.out.println("You investigate the " + name + ". " + description);
    }

    // Getters and setters...

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
