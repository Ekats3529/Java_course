package edu.hw1;

public class Task2 {
    public static int countDigits(int digit) {
        int num = Math.abs(digit);
        int result = 1;
        while (num > 9) {
            result++;
            num /= 10;
        }
        return result;
    }
}
