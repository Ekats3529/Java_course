package edu.project1;

import java.util.List;

class Main {

    private Main() {

    }

    private static final int MAX_ATTEMPTS = 5;

    public static void main(String[] args) { // q - end of the game
        List<String> words = List.of("hangman", "programming", "java", "computer", "code");
        Dictionary dictionary = new SimpleDictionary(words);
        ConsoleHangman hangman = new ConsoleHangman(dictionary, MAX_ATTEMPTS);
        hangman.run();
    }
}
