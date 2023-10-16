package edu.hw1;

public class Task5 {

    public static boolean isPalindrome(int num) {
        int num_copy = num;
        int num_reverse = 0;
        while (num_copy > 0) {
            num_reverse *= 10;
            num_reverse += num_copy % 10;
            num_copy /= 10;
        }
        return num == num_reverse;
    }

    public static int powOfTen(int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= 10;
        }
        return res;
    }

    public static boolean isPalindromeDescendant(int x) {
        if (x < 0) {
            return false;
        }
        String str = Integer.toString(x);
        if (x > 9) {
            if (isPalindrome(x)) {
                return true;
            }
            int new_x_odd = 0;
            int new_x_even = 0;
            int cnt = 1;
            int prev = 0;
            while (x > 0) {
                int cur = x % 10;
                if (cnt % 2 == 0) {
                    new_x_even += (prev + cur) * powOfTen((cnt / 2) - 1);
                } else {
                    new_x_odd += (prev + cur) * powOfTen(cnt / 2);
                }
                x /= 10;
                prev = cur;
                cnt++;
            }
            if (cnt % 2 == 1) {
                return isPalindromeDescendant(new_x_even);
            } else {
                return isPalindromeDescendant(new_x_odd);
            }
        }
        return false;
    }
}
