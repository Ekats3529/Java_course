package edu.project1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestForDictionary {
    Dictionary dictionary = new SimpleDictionary();

    @Test
    @DisplayName("Add the word")
    void test1() {

        String word = "ANYTHING";

        dictionary.addWordToDictionary(word);

        assertThat(dictionary.getDictionary()).asList().contains("anything");
    }
}
