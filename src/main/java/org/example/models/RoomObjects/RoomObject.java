package org.example.models.RoomObjects;

import org.example.game.Text;
import org.example.models.Player;
import org.example.models.Room;

public class RoomObject {
    // fields
    private final String name;
    private String description;
    private Text output = new Text();

    // constructor
    public RoomObject(String name) {
        this.name = name;
        this.description = output.getObjectDescription(name);
    }

    //getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void interactWithObject(Room room, Player player) {
        System.out.println("You investigate the " + name + ".\n" +
                " it is a" + description + ".");
    }
}
