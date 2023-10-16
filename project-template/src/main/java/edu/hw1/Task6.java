package edu.hw1;

import java.util.Arrays;

public class Task6 {

    public static int powOfTen(int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= 10;
        }
        return res;
    }

    public static int countK(int x, int n) throws StackOverflowError {
        if (x == 6174) {
            return n;
        }
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = x % 10;
            x /= 10;
        }
        int cnt_same = 1;
        for (int i = 1; i < 4; i++) {
            if (nums[i] == nums[i - 1]) {
                cnt_same++;
            }
        }
        if (cnt_same == 4) {
            return -1;
        }
        Arrays.sort(nums);
        int mx = 0;
        int mn = 0;
        for (int i = 0; i < 4; i++) {
            mx += nums[i] * powOfTen(i);
            mn += nums[4 - i - 1] * powOfTen(i);
        }
        return countK(mx - mn, n + 1);
    }

    public static int countK(int x) {
        return countK(x, 0);
    }
}
