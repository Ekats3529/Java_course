package edu.project1;

import java.util.List;

class Main {

    private Main() {

    }

    public static void main(String[] args) { // q - end of the game

        Player player = new HumanPlayer();
        List<String> words = List.of("hangman", "programming", "java", "computer", "code");
        Dictionary dictionary = new SimpleDictionary(words);
        String wordToGuess = dictionary.randomWord();

        ConsoleHangman hangman = new ConsoleHangman(player, wordToGuess);
        hangman.run();
    }
}
