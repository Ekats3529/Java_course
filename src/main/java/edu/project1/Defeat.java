package edu.project1;

import org.jetbrains.annotations.NotNull;

public record Defeat(char[] state, int attempt, int maxAttempts, @NotNull String message) implements GuessResult {

}
