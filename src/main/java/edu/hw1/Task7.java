package edu.hw1;

public class Task7 {

    public static int rotateLeft(int n, int shift) {

        return (n << shift) | (n >> (32 - shift));
    }

    public static int rotateRight(int n, int shift) {

        return (n >> shift) | (n << (32 - shift));

    }
}
