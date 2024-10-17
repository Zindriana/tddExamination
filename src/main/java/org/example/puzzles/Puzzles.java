package org.example.puzzles;

public abstract class Puzzles {
    protected String description;

    public Puzzles(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract boolean solve();
}
