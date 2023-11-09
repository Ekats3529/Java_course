package edu.hw5;

public final class Task7 {
    private Task7() {

    }

    public static boolean containsAtLeastThreeSymbolsAndTheThirdIsZero(String str) {
        return str.matches("^[01]{2}0[01]*$");
    }

    public static boolean startsWithAndEndsWithTheSameSymbol(String str) {
        return str.matches("^([01]).*\\1$");
    }

    public static boolean lengthBetweenOneAndThree(String str) {
        return str.matches("^[01]{1,3}$");
    }
}
