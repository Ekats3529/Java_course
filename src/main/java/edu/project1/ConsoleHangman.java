package edu.project1;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Logger;

public class ConsoleHangman extends HangmanGame{
    private static final int MAX_ATTEMPTS = 5;

    private final Logger logger = Logger.getLogger(ConsoleHangman.class.getName());

    private static final String QUIT_WORD = "quit";

    ConsoleHangman(Player player, String wordToGuess) {
        super(player, wordToGuess);
    }

    public void run() {
        Session session = new Session(this.wordToGuess, MAX_ATTEMPTS);
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
