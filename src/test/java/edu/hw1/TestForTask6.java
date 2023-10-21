package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask6 {
    Task6 task6 = new Task6();
    @Test
    public final void test1() {

        int expectedResult = 0;

        int actualResult = task6.countK(6174);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public final void test2() {

        int expectedResult = 1;

        int actualResult = task6.countK(8352);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public final void test3() {

        int expectedResult = 3;

        int actualResult = task6.countK(3524);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public final void test4() {

        int expectedResult = 5;

        int actualResult = task6.countK(6621);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public final void test5() {

        int expectedResult = 4;

        int actualResult = task6.countK(6554);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public final void test6() {

        int expectedResult = 3;

        int actualResult = task6.countK(1234);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public final void test7() throws StackOverflowError {

        int expectedResult = -1;

        int actualResult = task6.countK(6666);

        assertEquals(expectedResult, actualResult);

    }
}
