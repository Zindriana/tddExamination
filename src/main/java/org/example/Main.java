package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        DiceGamePuzzle diceGame = new DiceGamePuzzle("How lucky are you? Roll a dice and try to get higher than 3.", 3);

        boolean diceGameResult = diceGame.solve();

        if (diceGameResult) {
            System.out.println("You passed the dice game!");
        } else {
            System.out.println("You failed the dice game.");
        }
    }
}