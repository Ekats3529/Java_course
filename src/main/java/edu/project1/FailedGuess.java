package edu.project1;

import edu.project1.GuessResult;
import org.jetbrains.annotations.NotNull;

public record FailedGuess(char[] state, int attempt, int maxAttempts, @NotNull String message) implements GuessResult {
}
