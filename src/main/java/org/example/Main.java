package org.example;

import org.example.game.Game;
import org.example.game.GameUI;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        game.startGame();
        GameUI gameUI = new GameUI(game);
        gameUI.roomOption(game.getPlayer());
    }
}