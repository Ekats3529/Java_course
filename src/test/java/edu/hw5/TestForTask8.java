package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask8 {
    @ParameterizedTest
    @CsvSource({
        "111, true",
        "01, false",
        "10111, true"
    })
    @DisplayName("Строка нечетной длины")
    void firstRegexTest(String input, boolean expected) {
        boolean actual = Task8.isLengthOdd(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
        "1111, true",
        "111, false",
        "01, false",
        "01111, true"
    })
    @DisplayName("Строка начинается с 0 и имеет нечетную длину, " +
        "или начинается с 1 и имеет четную длину")
    void secondRegexTest(String input, boolean expected) {
        boolean actual = Task8.startsWithZeroLengthEvenOrStartsWithOneLengthOdd(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
        "1111, true",
        "111, false",
        "11, false",
        "0111, true"
    })
    @DisplayName("Любая строка, кроме 11 или 111")
    void fourthRegexTest(String input, boolean expected) {
        boolean actual = Task8.notTwoOrThreeOnes(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
        "1111, true",
        "1011, true",
        "10, true",
        "100, false"
    })
    @DisplayName("Каждый нечетный символ равен 1")
    void fifthRegexTest(String input, boolean expected) {
        boolean actual = Task8.everyOddIsOne(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
        "000, true",
        "10000, true",
        "10, false",
        "11000, false"
    })
    @DisplayName("Строка содержит не менее двух 0 и не более одной 1")
    void sixthRegexTest(String input, boolean expected) {
        boolean actual = Task8.containsAtLeastTwoZeroAndSingleOrNoOne(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
        "1111, false",
        "1011, false",
        "10, true",
        "0000101010, true"
    })
    @DisplayName("Нет последовательных 1")
    void seventhRegexTest(String input, boolean expected) {
        boolean actual = Task8.noConcurrentOnes(input);

        assertEquals(expected, actual);
    }




}
