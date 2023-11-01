package edu.hw1;

class Task2 {
    @SuppressWarnings("MagicNumber")
    public int countDigits(int digit) {
        int x = digit;
        if (digit == Integer.MIN_VALUE) {
            return 10;
        }
        if (x < 0) {
            x = Math.abs(digit);
        }
        int result = 1;
        while (x > 9) {
            result++;
            x /= 10;
        }
        return result;
    }
}
