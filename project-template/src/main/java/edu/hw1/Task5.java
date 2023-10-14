package edu.hw1;

public class Task5 {
    public static boolean isPalindromeDescendant(int x) {
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        // System.out.print(sb + " -> ");
        while (sb.length() > 1) {
            StringBuilder rev = new StringBuilder(sb);
            if ((sb.toString()).equals(rev.reverse().toString())) {
                return true;
            }
            StringBuilder tmp = new StringBuilder();
            for (int i = 1; i < sb.length(); i += 2) {
                tmp.append((Character.getNumericValue(sb.charAt(i)) +  Character.getNumericValue(sb.charAt(i - 1))));
            }
            if (sb.length() % 2 == 1){
                tmp.append(sb.charAt(sb.length() - 1));
            }

            // System.out.print(tmp + " -> ");
            sb = tmp;
        }
        return false;
    }
}
