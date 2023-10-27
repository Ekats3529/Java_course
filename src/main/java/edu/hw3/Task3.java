package edu.hw3;

import java.util.HashMap;
import java.util.Map;

class Task3 {
    public Task3() {

    }

    public <T> Map<T, Integer> freqDict(Iterable<T> arrayList) {
        Map<T, Integer> dict = new HashMap<>();

        arrayList.forEach(item -> {
            dict.put(item, dict.getOrDefault(item, 0) + 1);
        });

        return dict;
    }
}
