package edu.hw1;

class Task5 {
    @SuppressWarnings("MagicNumber")

    public boolean isPalindrome(int num) {
        int numCopy = num;
        int numReverse = 0;
        while (numCopy > 0) {
            numReverse *= 10;
            numReverse += numCopy % 10;
            numCopy /= 10;
        }
        return num == numReverse;
    }

    @SuppressWarnings("MagicNumber")

    public int powOfTen(int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= 10;
        }
        return res;
    }

    @SuppressWarnings({"MagicNumber", "ReturnCount"})

    public boolean isPalindromeDescendant(int x) {
        if (x < 0) {
            return false;
        }
        int newX = x;
        if (newX > 9) {
            if (isPalindrome(newX)) {
                return true;
            }
            int newOdd = 0;
            int newEven = 0;
            int cnt = 1;
            int prev = 0;
            while (newX > 0) {
                int cur = newX % 10;
                if (cnt % 2 == 0) {
                    newEven += (prev + cur) * powOfTen((cnt / 2) - 1);
                } else {
                    newOdd += (prev + cur) * powOfTen(cnt / 2);
                }
                newX /= 10;
                prev = cur;
                cnt++;
            }
            if (cnt % 2 == 1) {
                return isPalindromeDescendant(newEven);
            } else {
                return isPalindromeDescendant(newOdd);
            }
        }
        return false;
    }
}
