package edu.hw1;

import java.util.Arrays;

class Task6 {

    @SuppressWarnings("MagicNumber")

    public int powOfTen(int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= 10;
        }
        return res;
    }

    @SuppressWarnings("MagicNumber")
    public int countK(int x, int n) throws StackOverflowError {
        if (x == 6174) {
            return n;
        }
        int newX = x;
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = newX % 10;
            newX /= 10;
        }
        int cntSame = 1;
        for (int i = 1; i < 4; i++) {
            if (nums[i] == nums[i - 1]) {
                cntSame++;
            }
        }
        if (cntSame == 4) {
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

    public int countK(int x) {
        return countK(x, 0);
    }
}
