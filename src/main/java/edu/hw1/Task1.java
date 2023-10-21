package edu.hw1;

public class Task1 {

    public static Integer minutesToSeconds(String time) {
        String[] separate = time.split(":");
        if (separate.length != 2){
            return -1;
        }
        int minutes = Integer.parseInt(separate[0]);
        int seconds = Integer.parseInt(separate[1]);

        if (seconds > 59 || seconds < 0 || minutes < 0) {
            return -1;
        }
        return minutes * 60 + seconds;
    }
}
