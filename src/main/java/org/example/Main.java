package org.example;

import org.example.game.Game;
import org.example.game.GameUI;

/*TODO create a folder for npc and create separate npc that extends the NPC-class
*  Move the current conversation from the NPC class into a specific npc extended from the NPC-class
*  - Delete the y/n question when checking backpack and instead directly go to choose an item to use,
*       add an option to not use an item in the use item-menu after checking backpack.
*   - Add code to get a list of all RoomObjects in a room when investigating, almost copy paste of the Item-functionality
*   - Create room three content, ice room
*   - finish the interact with room object functionality (remember to use setDescription when stuff change
*   - add an if in the "what do you want to do interface choice menu" so you cannot interact with things when the room is dark
*   - update the description in the second room when it is dark, "It is too dark to see anything in here." appears two times
*   - add the hole in the second room as an object
*   - add the doors in the rooms as objects, so that the player can get descriptions and maybe hints
*   - maybe change so that instead of a list with items that is written out in the room, have those as parts of
*       the objects that the player can interact with and then get the item from the interaction
*   - instead of needing to press investigate over and over again, make it a do while until the player stops investigating
*   - maybe add so that the player can use items on objects in the room while investigating
*   - check the bug when trying to move the bench from the first room to the second room, it loops while pressing y
*       and then it repeats the same thing when pressing n*/

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        game.startGame();
        GameUI gameUI = new GameUI(game);
        gameUI.roomOption(game.getPlayer());

    }
}