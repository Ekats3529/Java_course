package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask4 {
    Task4 task4 = new Task4();
    @Test
    public final void test1() {

        String expectedResult = "214365";

        String actualResult = task4.fixString("123456");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public final void test2() {

        String expectedResult = "abcde";

        String actualResult = task4.fixString("badce");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public final void test3() {

        String expectedResult = "This is a mixed up string.";

        String actualResult = task4.fixString("hTsii  s aimex dpus rtni.g");

        assertEquals(expectedResult, actualResult);
    }

}
