package edu.project1;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Logger;

public class ConsoleHangman {
    private final Dictionary dictionary;
    private final int maxAttempts;

    private final Logger logger = Logger.getLogger(ConsoleHangman.class.getName());

    private static final String QUIT_WORD = "quit";

    ConsoleHangman(Dictionary dictionary, int maxAttempts) {
        this.dictionary = dictionary;
        this.maxAttempts = maxAttempts;
    }

    public void run() {
        String wordToGuess = dictionary.randomWord();
        Session session = new Session(wordToGuess, maxAttempts);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            logger.info("Guess a letter:");
            String guess;
            try {
                String input = scanner.nextLine().toLowerCase();
                if (input.length() != 1 && !Objects.equals(input, QUIT_WORD)) {
                    throw new RuntimeException();
                }
                guess = input;
            } catch (RuntimeException e) {
                logger.info("Invalid input. Try again. ");
                continue;
            }
            GuessResult guessResult = tryGuess(session, guess);
            printState(guessResult);

            if (guessResult instanceof Defeat || guessResult instanceof Win) {
                break;
            }
        }
    }

    static GuessResult tryGuess(Session session, String input) {
        if (Objects.equals(input, QUIT_WORD)) {
            return session.giveUp();
        }
        return session.guess(input.charAt(0));
    }

    private void printState(GuessResult guess) {
        logger.info(guess.message());
        if (guess instanceof Win || guess instanceof Defeat) {
            return;
        }
        logger.info("The word: " + new String(guess.state()));
    }
}
