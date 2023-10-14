package edu.hw1;
import java.util.Arrays;

public class Task3 {
    public static boolean isNestable(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int mx_a = a[a.length - 1];
        int mx_b = b[b.length - 1];
        int mn_a = a[0];
        int mn_b = b[0];

        return mn_a > mn_b && mx_a < mx_b;
    }
}
