package org.example.models.RoomObjects;

public class RoomObject {
    // fields
    private String name;
    private String description;

    // constructor
    public RoomObject(String name) {
        this.name = name;
        this.description = name;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
