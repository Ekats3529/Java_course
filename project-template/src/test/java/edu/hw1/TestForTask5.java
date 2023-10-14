package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestForTask5 {
    @Test
    public final void test1() {

        boolean actualResult = Task5.isPalindromeDescendant(11211230);

        assertTrue(actualResult);
    }

    @Test
    public final void test2() {

        boolean actualResult = Task5.isPalindromeDescendant(13001120);

        assertTrue(actualResult);
    }

    @Test
    public final void test3() {

        boolean actualResult = Task5.isPalindromeDescendant(23336014);

        assertTrue(actualResult);
    }

    @Test
    public final void test4() {

        boolean actualResult = Task5.isPalindromeDescendant(11);

        assertTrue(actualResult);
    }

    @Test
    public final void test5() {

        boolean actualResult = Task5.isPalindromeDescendant(1111112);

        assertTrue(actualResult);
    }

    @Test
    public final void test6() {

        boolean actualResult = Task5.isPalindromeDescendant(1112);

        assertFalse(actualResult);
    }

    @Test
    public final void test7() {

        boolean actualResult = Task5.isPalindromeDescendant(-12);

        assertFalse(actualResult);
    }
}
