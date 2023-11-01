package edu.hw3;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask2 {
    Task2 task2 = new Task2();

    @Test
    public final void test1() {

        var actualResult = task2.clusterize("()()()");

        var expectedResult = List.of("()", "()", "()");

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public final void test2() {

        var actualResult = task2.clusterize("((()))");

        var expectedResult = List.of("((()))");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public final void test3() {

        var actualResult = task2.clusterize("((()))(())()()(()())");

        var expectedResult = List.of("((()))", "(())", "()", "()", "(()())");

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public final void test4() {

        var actualResult = task2.clusterize("((())())(()(()()))");

        var expectedResult = List.of("((())())", "(()(()()))");

        assertEquals(expectedResult, actualResult);
    }
}
