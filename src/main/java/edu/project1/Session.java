package edu.project1;

import org.jetbrains.annotations.NotNull;

class Session {
    private final String answer;
    private final char[] userAnswer;
    private final int maxAttempts;
    private int attempts;

    Session(String answer, int maxAttempts) {
        this.answer = answer;
        this.maxAttempts = maxAttempts;
        this.userAnswer = new char[answer.length()];
        this.attempts = 0;
        for (int i = 0; i < answer.length(); i++) {
            userAnswer[i] = '*';
        }
    }

    @NotNull GuessResult guess(char guess) {
        boolean isGuessed = false;
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == guess) {
                userAnswer[i] = guess;
                isGuessed = true;
            }
        }
        if (isGuessed) {
            if (String.valueOf(userAnswer).equals(answer)) {
                return new Win(userAnswer, attempts, maxAttempts, "You won!");
            }
            return new SuccessfulGuess(userAnswer, attempts, maxAttempts, "Hit!");
        } else {
            attempts++;
            if (attempts >= maxAttempts) {
                return new Defeat(userAnswer, attempts, maxAttempts, "You lost!");
            }
            return new FailedGuess(
                userAnswer,
                attempts,
                maxAttempts,
                "Missed, mistake " + attempts + " out of " + maxAttempts + "."
            );
        }
    }

    @NotNull GuessResult giveUp() {
        return new Defeat(userAnswer, attempts, maxAttempts, "You gave up! The word was: " + answer);
    }
}
