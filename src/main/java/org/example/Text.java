package org.example;

import java.util.HashMap;
import java.util.Map;

public class Text {
    // Declaring itemDescriptions as a class variable
    private Map<String, String> itemDescriptions;

    public Text() {
        // Initializing item descriptions
        itemDescriptions = new HashMap<>();
        itemDescriptions.put("Die", "A bright white six-sided die.");
        itemDescriptions.put("Magic Wand", "A wand imbued with magical powers.");
        itemDescriptions.put("Sword", "A sharp, shiny sword.");
        // Add more items as needed
    }

    // Room descriptions
    public String getRoomDescriptionWhenEnter(String roomName) {
        switch (roomName) {
            case "Starting room":
                return "You return to the starting room.";
            case "Middle room":
                return "You enter a dark cavern.";
            case "Third room":
                return "You step into a mysterious chamber filled with echoes.";
            default:
                return "This room does not exist.";
        }
    }

    public String getRoomDescriptionWhenInvestigate(String roomName) {
        switch (roomName) {
            case "Starting room":
                return "The room is barely lit by a few candles. You feel a light breeze. " +
                       "You see something bright and small on the dark stone floor: " + 
                       getItemDescription("Die") + 
                       ". A hooded figure stands next to a large wooden door, " +
                       "which seems to be the only way out.";
            case "Middle room":
                return "You hear droplets falling onto the cavern floor. The stones feel cold against your bare feet.";
            case "Third room":
                return "The walls of the chamber are adorned with ancient symbols, and you sense a presence watching you.";
            default:
                return "You can't investigate that room.";
        }
    }

    // Get item description
    public String getItemDescription(String itemName) {
        return itemDescriptions.getOrDefault(itemName, "Description not found for the item: " + itemName);
    }

    // NPC descriptions
    public String getNpcDescription(String roomName) {
        switch (roomName) {
            case "Starting room":
                return "A hooded figure watches you closely.";
            case "Middle room":
                return "A shadowy silhouette looms in the darkness.";
            case "Third room":
                return "An ancient spirit whispers secrets to the air.";
            default:
                return "No NPC in this room.";
        }
    }

    // Hints
    public static String getRoomHints(String roomName) {
        switch (roomName) {
            case "Starting room":
                return "Look carefully at your surroundings.";
            case "Middle room":
                return "The sound may lead you to a hidden path.";
            case "Third room":
                return "The symbols may hold the key to your next move.";
            case "Last room":
                return "Trust your instincts.";
            default:
                return "No hints available for this room.";
        }
    }
}
