package edu.project1;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Logger;
import static edu.project1.ConsoleHangman.QUIT_WORD;
import static edu.project1.ConsoleHangman.tryGuess;

public class HumanPlayer implements Player {
    private final Logger logger = Logger.getLogger(ConsoleHangman.class.getName());
    Scanner scanner = new Scanner(System.in);

    @Override
    public GuessResult guess(Session session) {
        logger.info("Guess a letter:");
        String guess;
        try {
            String input = scanner.nextLine().toLowerCase();
            if (input.length() != 1 && !Objects.equals(input, QUIT_WORD)) {
                throw new RuntimeException();
            }
            guess = input;
            return tryGuess(session, guess);

        } catch (RuntimeException e) {
            logger.info("Invalid input. Try again. ");
            return this.guess(session);
        }
    }
}
