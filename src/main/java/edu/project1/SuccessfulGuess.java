package edu.project1;

import org.jetbrains.annotations.NotNull;

public record SuccessfulGuess(char[] state, int attempt, int maxAttempts, @NotNull String message)
    implements GuessResult {
}
