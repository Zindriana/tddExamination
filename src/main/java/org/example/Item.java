package org.example;

public class Item {
    private String name;
    private String description;

    // Konstruktor för att skapa ett nytt Item med namn och beskrivning
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getter för namnet
    public String getName() {
        return name;
    }

    // Getter för beskrivningen
    public String getDescription() {
        return description;
    }

    // Setter för att ändra namnet (om det behövs)
    public void setName(String name) {
        this.name = name;
    }

    // Setter för att ändra beskrivningen (om det behövs)
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
