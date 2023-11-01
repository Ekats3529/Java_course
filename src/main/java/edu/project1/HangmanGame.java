package edu.project1;

public class HangmanGame {
    Player player;
    String wordToGuess;

    public HangmanGame(Player player, String word) {
        this.player = player;
        wordToGuess = word;
    }
}
