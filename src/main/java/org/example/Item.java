package org.example;

public class Item {

    private String name;
    private String description;

    // Konstruktorn som hämtar beskrivningen baserat på beskrivningsnyckeln
    public Item(String name, String descriptionKey) {
        this.name = name;
        // Hämta beskrivningen från Text-klassen
        this.description = new Text().getItemDescription(descriptionKey); // Justerat för att hämta baserat på nyckeln
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
