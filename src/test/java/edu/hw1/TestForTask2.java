package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask2 {
    Task2 task2 = new Task2();
    @Test
    public final void test1() {

        int expectedResult = 4;

        assertEquals(expectedResult, task2.countDigits(4666));
    }

    @Test
    public final void test2() {

        int expectedResult = 10;

        assertEquals(expectedResult, task2.countDigits(1234567890));
    }

    @Test
    public final void test3() {

        int expectedResult = 1;

        assertEquals(expectedResult, task2.countDigits(0));
    }

    @Test
    public final void test4() {

        int expectedResult = 1;

        assertEquals(expectedResult, task2.countDigits(5));
    }

    @Test
    public final void test5() {

        int expectedResult = 1;

        assertEquals(expectedResult, task2.countDigits(5));
    }

    @Test
    public final void test6() {

        int expectedResult = 3;

        assertEquals(expectedResult, task2.countDigits(-123));
    }

    @Test
    public final void test7() {

        int expectedResult = 10;

        assertEquals(expectedResult, task2.countDigits(Integer.MIN_VALUE));
    }
}
