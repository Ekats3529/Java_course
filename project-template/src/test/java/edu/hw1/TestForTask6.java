package edu.hw1;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestForTask6 {
    @Test
    public final void test1(){

        Integer expectedResult = 0;

        Integer actualResult = Task6.countK(6174);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public final void test2(){

        Integer expectedResult = 1;

        Integer actualResult = Task6.countK(8352);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public final void test3(){

        Integer expectedResult = 3;

        Integer actualResult = Task6.countK(3524);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public final void test4(){

        Integer expectedResult = 5;

        Integer actualResult = Task6.countK(6621);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public final void test5(){

        Integer expectedResult = 4;

        Integer actualResult = Task6.countK(6554);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public final void test6(){

        Integer expectedResult = 3;

        Integer actualResult = Task6.countK(1234);

        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
