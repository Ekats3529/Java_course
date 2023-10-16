package edu.hw1;

public class Task2 {
    public static int countDigits(int digit) {
        if (digit == Integer.MIN_VALUE) {
            return 10;
        }
        if (digit < 0) {
            digit = Math.abs(digit);
        }
        int result = 1;
        while (digit > 9) {
            result++;
            digit /= 10;
        }
        return result;
    }
}
