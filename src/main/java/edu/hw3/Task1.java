package edu.hw3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Task1 {

    final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public Task1() {

    }

    public String atbash(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char curSymbol = str.charAt(i);
            boolean isUpper = Character.isUpperCase(curSymbol);
            int index = alphabet.indexOf(Character.toLowerCase(curSymbol));
            if (index != -1) {
                if (isUpper) {
                    result.append(Character.toUpperCase(alphabet.charAt(26 - index - 1)));
                } else {
                    result.append(alphabet.charAt(26 - index - 1));
                }
            } else {
                result.append(curSymbol);
            }
        }
        return result.toString();
    }
}
