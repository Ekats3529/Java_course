package edu.hw1;

class Task7 {
    @SuppressWarnings("MagicNumber")

    public int rotateLeft(int n, int shift) {

        return (n << shift) | (n >> (32 - shift));
    }

    @SuppressWarnings("MagicNumber")
    public int rotateRight(int n, int shift) {

        return (n >> shift) | (n << (32 - shift));

    }
}
