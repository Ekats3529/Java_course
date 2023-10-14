package edu.hw1;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestForTask1 {
    @Test
    @DisplayName("Okay")
    public final void test1(){

        Integer expectedResult = 60;

        Integer actualResult = Task1.minutesToSeconds("01:00");

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    @DisplayName("Wrong seconds format")
    public final void test2(){

        Integer expectedResult = -1;

        Integer actualResult = Task1.minutesToSeconds("01:60");

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    @DisplayName("Negative values")
    public final void test3(){

        Integer expectedResult = -1;

        Integer actualResult = Task1.minutesToSeconds("-01:00");

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    @DisplayName("Okay")
    public final void test4(){

        Integer expectedResult = 59 * 60 + 59;

        Integer actualResult = Task1.minutesToSeconds("59:59");

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    @DisplayName("Okay")
    public final void test5(){

        Integer expectedResult = 9999 * 60;

        Integer actualResult = Task1.minutesToSeconds("9999:00");

        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
