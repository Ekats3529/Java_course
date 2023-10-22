package edu.project1;

import org.jetbrains.annotations.NotNull;

sealed public interface GuessResult permits Defeat, Win, SuccessfulGuess, FailedGuess {
    char[] state();

    @NotNull String message();
}
