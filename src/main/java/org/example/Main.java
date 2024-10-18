package org.example;

import org.example.game.Game;
import org.example.game.GameUI;

/*TODO create a folder for npc and create separate npc that extends the NPC-class
*  Move the current conversation from the NPC class into a specific npc extended from the NPC-class
*  - Delete the y/n question when checking backpack and instead directly go to choose an item to use,
*       add an option to not use an item in the use item-menu after checking backpack.
*   - Add code to get a list of all RoomObjects in a room when investigating, almost copy paste of the Item-functionality
*   - Create room three content, ice room
*   - finish the interact with room object functionality (remember to use setDescription when stuff change*/
public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        game.startGame();
        GameUI gameUI = new GameUI(game);
        gameUI.roomOption(game.getPlayer());

    }
}