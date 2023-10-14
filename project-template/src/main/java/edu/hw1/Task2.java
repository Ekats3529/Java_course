package edu.hw1;

public class Task2 {
    public static int countDigits(int digit) {
        int result = 1;
        while (digit > 9) {
            result++;
            digit /= 10;
        }
        return result;
    }
}
