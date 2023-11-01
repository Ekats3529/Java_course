package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestForTask3 {
    Task3 task3 = new Task3();
    @Test
    public final void test1() {

        boolean actualResult = task3.isNestable(new int[] {1, 2, 3, 4}, new int[] {0, 6});

        assertTrue(actualResult);
    }

    @Test
    public final void test2() {

        boolean actualResult = task3.isNestable(new int[] {3, 1}, new int[] {4, 0});

        assertTrue(actualResult);
    }

    @Test
    public final void test3() {

        boolean actualResult = task3.isNestable(new int[] {9, 9, 8}, new int[] {8, 9});

        assertFalse(actualResult);
    }

    @Test
    public final void test4() {

        boolean actualResult = task3.isNestable(new int[] {1, 2, 3, 4}, new int[] {2, 3});

        assertFalse(actualResult);
    }
}
