package edu.hw3;

class Task1 {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final int ALPHABET_SIZE = 26;

    public String atbash(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char curSymbol = str.charAt(i);
            boolean isUpper = Character.isUpperCase(curSymbol);
            int index = ALPHABET.indexOf(Character.toLowerCase(curSymbol));
            if (index != -1) {
                if (isUpper) {
                    result.append(Character.toUpperCase(ALPHABET.charAt(ALPHABET_SIZE - index - 1)));
                } else {
                    result.append(ALPHABET.charAt(ALPHABET_SIZE - index - 1));
                }
            } else {
                result.append(curSymbol);
            }
        }
        return result.toString();
    }
}
