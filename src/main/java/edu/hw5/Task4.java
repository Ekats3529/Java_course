package edu.hw5;

class Task4 {
    public static boolean isPasswordValid(String password) {
        return password.matches(".*[~!@#$%^&*|].*");
    }
}
