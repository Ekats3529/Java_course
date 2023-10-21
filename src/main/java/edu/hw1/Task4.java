package edu.hw1;

class Task4 {
    public String fixString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2) {
            result.append(str.charAt(i));
            result.append(str.charAt(i - 1));
        }
        if (str.length() % 2 == 1) {
            result.append(str.charAt(str.length() - 1));
        }
        return result.toString();
    }
}
