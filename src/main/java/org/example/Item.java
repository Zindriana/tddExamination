package org.example;

public class Item {
 
    // Attribut för namn och beskrivning av föremålet
    private String name;
    private String description;

    // Konstruktor för att skapa ett Item-objekt
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Metod för att plocka upp föremålet
    public void pickUp() {
        System.out.println("You have picked up: " + name);
        // Lägg till logik för att lägga föremålet i spelarens inventarie
    }

    // Metod för att använda föremålet
    public void use() {
        System.out.println("You have used the " + name);
        // Lägg till logik för vad som händer när föremålet används
    }

    // Metod för att undersöka föremålet
    public void investigateItem() {
        System.out.println("You investigate the " + name + ". " + description);
    }

    // Getters för name och description

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Setters för name och description
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
