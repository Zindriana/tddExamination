package org.example;

public class Item {

    private String name;
    private String description;

    // Konstruktorn som tar namnet och hämtar beskrivningen från Text-klassen
    public Item(String name) {
        this.name = name;
        // Hämta beskrivningen från Text-klassen baserat på namnet
        this.description = new Text().getItemDescription(name);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
        // Uppdatera beskrivningen om namnet ändras
        this.description = new Text().getItemDescription(name);
    }

    public void setDescription(String description) {
        this.description = description; // Möjliggör manuell inställning av beskrivning
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
