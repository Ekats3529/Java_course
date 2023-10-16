package edu.hw1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask1 {
    @Test
    @DisplayName("Okay")
    public final void test1() {

        int expectedResult = 60;

        assertEquals(expectedResult, Task1.minutesToSeconds("01:00"));
    }

    @Test
    @DisplayName("Wrong seconds format")
    public final void test2() {

        int expectedResult = -1;

        assertEquals(expectedResult, Task1.minutesToSeconds("01:60"));
    }

    @Test
    @DisplayName("Negative values")
    public final void test3() {

        int expectedResult = -1;

        assertEquals(expectedResult, Task1.minutesToSeconds("-01:00"));
    }

    @Test
    @DisplayName("Okay")
    public final void test4() {

        int expectedResult = 59 * 60 + 59;

        assertEquals(expectedResult, Task1.minutesToSeconds("59:59"));
    }

    @Test
    @DisplayName("Okay")
    public final void test5() {

        int expectedResult = 9999 * 60;

        assertEquals(expectedResult, Task1.minutesToSeconds("9999:00"));
    }

    @Test
    @DisplayName("More than 2 digits between :")
    public final void test6() {

        int expectedResult = -1;

        assertEquals(expectedResult, Task1.minutesToSeconds("01:00:00"));
    }
    @Test
    @DisplayName("More than 2 digits between :")
    public final void test7() {

        int expectedResult = -1;

        assertEquals(expectedResult, Task1.minutesToSeconds("123"));
    }
}
