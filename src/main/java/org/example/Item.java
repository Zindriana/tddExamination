package org.example;

public class Item {

    private String name;
    private String description;


    // Constructor that fetches the description from the Text class
    public Item(String name) {
        this.name = name;
        this.description = new Text().getItemDescription(name); // Fetch description based on name

    }

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
        this.description = description; // Allows manual setting of description
    }

    public void investigateItem() {
        System.out.println("You investigate the " + name + ". " + description);
    }

    public void pickUp() {
        System.out.println("You have picked up: " + name);
    }

    public void use() {
        System.out.println("You have used: " + name);
    }
}
