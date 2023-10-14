package edu.hw1;

import java.util.Arrays;

public class Task3 {
    public static boolean isNestable(int[] a, int[] b) {
        int mx_a = a[0];
        int mx_b = b[0];
        int mn_a = a[0];
        int mn_b = b[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > mx_a) {
                mx_a = a[i];
            }
            if (a[i] < mn_a) {
                mn_a = a[i];
            }
        }

        for (int i = 1; i < b.length; i++) {
            if (b[i] > mx_b) {
                mx_b = b[i];
            }
            if (b[i] < mn_b) {
                mn_b = b[i];
            }
        }

        return mn_a > mn_b && mx_a < mx_b;
    }
}
