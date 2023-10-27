package edu.hw3;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;

class Task4 {

    static final Map<Integer, String> ROMAN_DIGITS = Map.ofEntries(
        entry(1, "I"),
        entry(4, "IV"),
        entry(5, "V"),
        entry(9, "IX"),
        entry(10, "X"),
        entry(40, "XL"),
        entry(50, "L"),
        entry(90, "XC"),
        entry(100, "C"),
        entry(400, "CD"),
        entry(500, "D"),
        entry(900, "CM"),
        entry(1000, "M")
    );

    private final static List<Integer> ROMAN_KEYS = ROMAN_DIGITS.keySet()
        .stream()
        .sorted(Collections.reverseOrder())
        .toList();

    Task4() {

    }

    public static String convertToRoman(int digit) {
        int curNumber = digit;
        StringBuilder result = new StringBuilder();
        Iterator<Integer> iterator = ROMAN_KEYS.iterator();

        while (curNumber > 0) {
            int curRoman = iterator.next();
            if (curNumber >= curRoman) {
                result.append(ROMAN_DIGITS.get(curRoman).repeat(curNumber / curRoman));
                curNumber %= curRoman;
            }
        }

        return result.toString();
    }
}
