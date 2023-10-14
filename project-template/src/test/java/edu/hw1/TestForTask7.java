package edu.hw1;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestForTask7 {
    @Test
    public final void test1(){

        Integer expectedResult = 4;

        Integer actualResult = Task7.rotateRight(8, 1);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public final void test2(){

        Integer expectedResult = 1;

        Integer actualResult = Task7.rotateLeft(16, 1);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public final void test3(){

        Integer expectedResult = 6;

        Integer actualResult = Task7.rotateLeft(17, 2);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
