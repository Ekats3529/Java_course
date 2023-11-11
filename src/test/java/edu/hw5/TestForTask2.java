package edu.hw5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask2 {
    static Stream<Arguments> argumentsStreamGetAll() {
        return Stream.of(
            Arguments.of(
                1925,
                List.of(
                    LocalDate.of(1925, 2, 13),
                    LocalDate.of(1925, 3, 13),
                    LocalDate.of(1925, 11, 13)
                )
            ),
            Arguments.of(
                2024,
                List.of(
                    LocalDate.of(2024, 9, 13),
                    LocalDate.of(2024, 12, 13)
                )
            )
        );
    }

    static Stream<Arguments> argumentsStreamGetClosest() {
        return Stream.of(
            Arguments.of(
                LocalDate.now(),
                LocalDate.of(2024, 9, 13)
            ),
            Arguments.of(
                LocalDate.of(1925, 2, 12),
                LocalDate.of(1925, 2, 13)
            )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsStreamGetAll")
    void test(int input, List<LocalDate> expected) {

        List<LocalDate> actual = Task2.getAllFridayThirteens(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("argumentsStreamGetClosest")
    void test2(LocalDate input, LocalDate expected) {

        LocalDate actual = Task2.getTheClosestFridayThirteen(input);

        assertEquals(expected, actual);
    }

}
