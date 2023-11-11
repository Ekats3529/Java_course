package edu.hw5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask6 {
    static Stream<Arguments> argumentsStream() {
        return Stream.of(
            Arguments.of("achfdbaabgabcaabg", "abc", true),
            Arguments.of("abababaab", "ccc", false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void test(String text, String str, boolean expected) {

        boolean actual = Task6.isSubstring(text, str);

        assertEquals(expected, actual);
    }
}
