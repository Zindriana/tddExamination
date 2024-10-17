package org.example;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        game.startGame();
        GameUI gameUI = new GameUI(game);
        gameUI.roomOption(game.getPlayer());
    }
}