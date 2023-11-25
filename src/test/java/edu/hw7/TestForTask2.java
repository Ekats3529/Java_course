package edu.hw7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask2 {
    @ParameterizedTest
    @CsvSource({"12,479001600", "5,120", "0,1", "1,1"})
    void test(int number, int expectedResult) throws InterruptedException {
        int actualResult = Task2.calculateFactorial(number);

        assertEquals(expectedResult, actualResult);
    }
}
