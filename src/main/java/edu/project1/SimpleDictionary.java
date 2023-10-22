package edu.project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.jetbrains.annotations.NotNull;

class SimpleDictionary implements Dictionary {

    private final List<String> dictionary;
    private final Random random = new Random();

    SimpleDictionary() {
        dictionary = new ArrayList<String>();
    }

    SimpleDictionary(List<String> dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public @NotNull String randomWord() {
        return dictionary.get(random.nextInt(dictionary.size()));
    }

    public void addWordToDictionary(String word) {
        dictionary.add(word.toLowerCase());
    }

    @Override
    public List<String> getDictionary() {
        return dictionary;
    }

}
