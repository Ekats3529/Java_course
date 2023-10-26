package edu.hw1;

class Task3 {
    public boolean isNestable(int[] a, int[] b) {
        int mxA = a[0];
        int mxB = b[0];
        int mnA = a[0];
        int mnB = b[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > mxA) {
                mxA = a[i];
            }
            if (a[i] < mnA) {
                mnA = a[i];
            }
        }

        for (int i = 1; i < b.length; i++) {
            if (b[i] > mxB) {
                mxB = b[i];
            }
            if (b[i] < mnB) {
                mnB = b[i];
            }
        }

        return mnA > mnB && mxA < mxB;
    }
}
