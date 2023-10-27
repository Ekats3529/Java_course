package edu.hw3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask4 {
    Task4 task4 = new Task4();

    static Stream<Arguments> decimalToRomanTestArguments() {
        return Stream.of(
            Arguments.of(2, "II"),
            Arguments.of(12, "XII"),
            Arguments.of(16, "XVI"),
            Arguments.of(4, "IV")
        );
    }

    @ParameterizedTest
    @MethodSource("decimalToRomanTestArguments")
    void convertDecimalToRomanTest(int input, String expected) {
        String actualResult = task4.convertToRoman(input);

        assertEquals(expected, actualResult);
    }
}
