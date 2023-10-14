package edu.hw1;
import java.util.Arrays;

public class Task7 {

    public static int findNextPowerOf2(int n)
    {
        n--;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;
        return ++n;
    }

    public static int rotateLeft(int n, int shift){
        return ((n << shift) | (n >> ((int)  ((Math.ceil((Math.log(n) + Math.log(2) - 1)/Math.log(2))) + 1 - shift))))
            & ( findNextPowerOf2(n) - 1);
    }
    public static int rotateRight(int n, int shift){

        return ((n >> shift) | (n << ((int) (Math.ceil((Math.log(n) + Math.log(2) - 1) / Math.log(2))) + 1 - shift)))
            & ( findNextPowerOf2(n) - 1);

    }
}
