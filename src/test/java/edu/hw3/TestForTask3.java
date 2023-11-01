package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask3 {
    Task3 task3 = new Task3();

    @Test
    @DisplayName("integers")
    public final void test1() {

        List<Integer> integerList = List.of(1, 1, 1, 3, 3, 2);

        var freqDict = task3.freqDict(integerList);

        Map<Integer, Integer> expectedResult = Map.of(1, 3, 3, 2, 2, 1);

        assertEquals(expectedResult, freqDict);
    }

    @Test
    @DisplayName("strings 1")
    public final void test2() {

        List<String> stringList = List.of("a", "bb", "a", "bb");

        var freqDict = task3.freqDict(stringList);

        Map<String, Integer> expectedResult = Map.of("a", 2, "bb", 2);

        assertEquals(expectedResult, freqDict);
    }

    @Test
    @DisplayName("strings 2")
    public final void test3() {

        List<String> stringList = List.of("this", "and", "that", "and");

        var freqDict = task3.freqDict(stringList);

        Map<String, Integer> expectedResult = Map.of("that", 1, "and", 2, "this", 1);

        assertEquals(expectedResult, freqDict);
    }

    @Test
    @DisplayName("strings 3")
    public final void test4() {

        List<String> stringList = List.of("код", "код", "код", "bug");

        var freqDict = task3.freqDict(stringList);

        Map<String, Integer> expectedResult = Map.of("код", 3, "bug", 1);

        assertEquals(expectedResult, freqDict);
    }

    @Test
    @DisplayName("integers Unique")
    public final void test5() {

        List<Integer> integersUnique = List.of(1, 2, 3, 4, 5);

        var freqDict = task3.freqDict(integersUnique);

        Map<Integer, Integer> expectedResult = Map.of(1, 1, 2, 1, 3, 1, 4, 1, 5, 1);

        assertEquals(expectedResult, freqDict);
    }
}
