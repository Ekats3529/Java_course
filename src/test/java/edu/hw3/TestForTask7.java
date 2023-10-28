package edu.hw3;

import edu.hw3.Task7.NullComparator;
import org.junit.jupiter.api.Test;
import java.util.TreeMap;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestForTask7 {

    @Test
    void test1() {
        NullComparator<String> comparator = new NullComparator<>();

        TreeMap<String, String> treeMap = new TreeMap<>(comparator);

        treeMap.put(null, "test");

        assertTrue(treeMap.containsKey(null));
    }

    @Test
    void test2() {
        NullComparator<Integer> comparator = new NullComparator<>();

        TreeMap<Integer, Integer> treeMap = new TreeMap<>(comparator);

        treeMap.put(null, 100);

        assertTrue(treeMap.containsKey(null));
    }
}
