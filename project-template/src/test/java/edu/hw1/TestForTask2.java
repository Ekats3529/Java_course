package edu.hw1;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestForTask2 {
    @Test
    public final void test1(){

        Integer expectedResult = 4;

        Integer actualResult = Task2.countDigits(4666);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public final void test2(){

        Integer expectedResult = 10;

        Integer actualResult = Task2.countDigits(1234567890);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public final void test3(){

        Integer expectedResult = 1;

        Integer actualResult = Task2.countDigits(0);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public final void test4(){

        Integer expectedResult = 1;

        Integer actualResult = Task2.countDigits(5);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public final void test5(){

        Integer expectedResult = 2;

        Integer actualResult = Task2.countDigits(10);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
