package edu.hw1;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestForTask4 {
    @Test
    public final void test1(){

        String expectedResult = "214365";

        String actualResult = Task4.fixString("123456");

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public final void test2(){

        String expectedResult = "abcde";

        String actualResult = Task4.fixString("badce");

        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public final void test3(){

        String expectedResult = "This is a mixed up string.";

        String actualResult = Task4.fixString("hTsii  s aimex dpus rtni.g");

        assertThat(actualResult).isEqualTo(expectedResult);
    }

}
