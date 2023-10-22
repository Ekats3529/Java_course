package edu.project1;

import java.util.List;
import org.jetbrains.annotations.NotNull;

public interface Dictionary {
    @NotNull String randomWord();

    void addWordToDictionary(String word);

    List<String> getDictionary();
}
