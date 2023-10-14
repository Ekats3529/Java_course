package edu.hw1;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestForTask5 {
    @Test
    public final void test1(){

        Boolean actualResult = Task5.isPalindromeDescendant(11211230);

        assertThat(actualResult).isEqualTo(true);
    }
    @Test
    public final void test2(){

        Boolean actualResult = Task5.isPalindromeDescendant(13001120);

        assertThat(actualResult).isEqualTo(true);
    }
    @Test
    public final void test3(){

        Boolean actualResult = Task5.isPalindromeDescendant(23336014);

        assertThat(actualResult).isEqualTo(true);
    }
    @Test
    public final void test4(){

        Boolean actualResult = Task5.isPalindromeDescendant(11);

        assertThat(actualResult).isEqualTo(true);
    }
    @Test
    public final void test5(){

        Boolean actualResult = Task5.isPalindromeDescendant(1111112);

        assertThat(actualResult).isEqualTo(true);
    }
    @Test
    public final void test6(){

        Boolean actualResult = Task5.isPalindromeDescendant(1112);

        assertThat(actualResult).isEqualTo(false);
    }
}
