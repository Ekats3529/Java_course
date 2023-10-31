package edu.hw3;

import org.junit.jupiter.api.Test;
import java.util.TreeMap;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestForTask7 {

    @Test
    void test1() {
        TreeMap<String, String> treeMap = new TreeMap<>(Task7.nullComparator());

        treeMap.put(null, "test");

        assertTrue(treeMap.containsKey(null));
    }

    @Test
    void test2() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(Task7.nullComparator());

        treeMap.put(null, 100);

        assertTrue(treeMap.containsKey(null));
    }
}
