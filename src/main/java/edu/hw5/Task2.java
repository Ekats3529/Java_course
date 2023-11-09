package edu.hw5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Task2 {
    private Task2() {

    }

    private static final int THIRTEEN = 13;
    private static final int MONTHS_COUNT = 12;

    public static List<LocalDate> getAllFridayThirteens(int year) {
        List<LocalDate> result = new ArrayList<>();

        for (int month = 1; month <= MONTHS_COUNT; month++) {
            LocalDate day = LocalDate.of(year, month, THIRTEEN);

            if (day.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                result.add(day);
            }
        }

        return result;
    }

    public static LocalDate getTheClosestFridayThirteen(LocalDate date) {
        LocalDate newDate = date;

        if (date.getDayOfMonth() > THIRTEEN) {
            newDate = date.plusMonths(1);
        }
        newDate = newDate.withDayOfMonth(THIRTEEN);

        while (newDate.getDayOfWeek() != DayOfWeek.FRIDAY) {
            newDate = newDate.plusMonths(1);
        }
        return newDate;
    }
}
