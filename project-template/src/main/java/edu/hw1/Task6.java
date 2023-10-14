package edu.hw1;
import java.util.Arrays;

public class Task6 {
    public static int countK(int x, int ... n) {
        int cnt = 0;
        if (n.length == 1){
            cnt = n[0];
        }
        if (x == 6174){
            return cnt;
        }
        int[] nums = new int[4];
        for (int i =0; i<4; i++){
            nums[i] = x % 10;
            x /= 10;
        }
        Arrays.sort(nums);
        int mx = 0;
        int mn = 0;
        for (int i = 0; i < 4; i++){
            mx += nums[i] * Math.pow(10, i);
            mn += nums[4 - i - 1] * Math.pow(10, i);
        }
        return countK(mx - mn, cnt + 1);
    }
}
