package org.example;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        game.startGame();
        GameUI gameUI = new GameUI();
        gameUI.roomOption(game.getPlayer());

    }
}