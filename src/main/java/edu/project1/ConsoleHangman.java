package edu.project1;

import java.util.Objects;
import java.util.logging.Logger;

public class ConsoleHangman extends HangmanGame {
    private static final int MAX_ATTEMPTS = 5;


    private final Logger logger = Logger.getLogger(ConsoleHangman.class.getName());

    static final String QUIT_WORD = "quit";

    ConsoleHangman(Player player, String wordToGuess) {
        super(player, wordToGuess);
    }

    public void run() {
        Session session = new Session(this.wordToGuess, MAX_ATTEMPTS);

        while (true) {
            GuessResult guessResult = player.guess(session);
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
