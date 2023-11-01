package edu.project1;

import org.jetbrains.annotations.NotNull;

public record Win(char[] state, int attempt, int maxAttempts, @NotNull String message) implements GuessResult {
}
