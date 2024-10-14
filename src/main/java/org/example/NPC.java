package org.example;

public class NPC extends Player {

    private String description;

    public NPC(String name) {
        super("NPC_" + name);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void checkBackpack() {
        System.out.println("checkBackpack method is not supported for NPC");
    }
}

