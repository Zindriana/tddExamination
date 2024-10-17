package org.example.models;

public class RoomObject {
    // fields
    private String name;
    private String description;

    // constructor
    public RoomObject(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
