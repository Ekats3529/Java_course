package edu.project1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestForDictionary {
    Dictionary dictionary = new Dictionary();

    @Test
    @DisplayName("Add the word")
    void test1() {

        String word = "anything";

        dictionary.addWordToDictionary(word);

        assertThat(dictionary.getDictionary()).asList().contains(word);
    }
}
