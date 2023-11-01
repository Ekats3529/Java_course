package edu.project1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestForConsoleHangman {
    @Test
    @DisplayName("Win game without mistakes")
    void test1() {
        Session session = new Session("hello", 5);
        GuessResult result = ConsoleHangman.tryGuess(session, "h");
        assertThat(result).isInstanceOf(SuccessfulGuess.class);

        result = ConsoleHangman.tryGuess(session, "e");
        assertThat(result).isInstanceOf(SuccessfulGuess.class);

        result = ConsoleHangman.tryGuess(session, "l");
        assertThat(result).isInstanceOf(SuccessfulGuess.class);

        result = ConsoleHangman.tryGuess(session, "o");
        assertThat(result).isInstanceOf(Win.class);
    }

    @Test
    @DisplayName("Lose game")
    void test2() {
        Session session = new Session("hello", 5);
        GuessResult result = null;
        for (int i = 0; i < 5; ++i) {
            result = ConsoleHangman.tryGuess(session, "a");
        }

        assertThat(result).isInstanceOf(Defeat.class);
    }

    @Test
    @DisplayName("Incorrect guess")
    void test3() {
        GuessResult result = ConsoleHangman.tryGuess(new Session("hello", 5), "z");
        assertThat(result).isInstanceOf(FailedGuess.class);
    }

    @Test
    @DisplayName("Correct guess")
    void test4() {
        GuessResult result = ConsoleHangman.tryGuess(new Session("hello", 5), "e");
        assertThat(result).isInstanceOf(SuccessfulGuess.class);
    }

    @Test
    @DisplayName("Win game with mistakes")
    void test5() {
        Session session = new Session("hello", 5);
        GuessResult result = ConsoleHangman.tryGuess(session, "h");
        assertThat(result).isInstanceOf(SuccessfulGuess.class);

        result = ConsoleHangman.tryGuess(session, "e");
        assertThat(result).isInstanceOf(SuccessfulGuess.class);

        result = ConsoleHangman.tryGuess(session, "l");
        assertThat(result).isInstanceOf(SuccessfulGuess.class);

        result = ConsoleHangman.tryGuess(session, "p");
        assertThat(result).isInstanceOf(FailedGuess.class);

        result = ConsoleHangman.tryGuess(session, "r");
        assertThat(result).isInstanceOf(FailedGuess.class);

        result = ConsoleHangman.tryGuess(session, "o");
        assertThat(result).isInstanceOf(Win.class);
    }

    @Test
    @DisplayName("Give up")
    void test6() {
        Session session = new Session("hello", 5);
        GuessResult result = ConsoleHangman.tryGuess(session, "quit");
        assertThat(result).isInstanceOf(Defeat.class);
    }
}
