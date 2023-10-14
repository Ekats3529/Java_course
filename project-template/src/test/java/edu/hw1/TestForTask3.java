package edu.hw1;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestForTask3 {
    @Test
    public final void test1(){

        Boolean actualResult = Task3.isNestable(new int[]{1, 2, 3, 4}, new int[] {0, 6});

        assertThat(actualResult).isEqualTo(true);
    }
    @Test
    public final void test2(){

        Boolean actualResult = Task3.isNestable(new int[]{3, 1}, new int[] {4, 0});

        assertThat(actualResult).isEqualTo(true);
    }
    @Test
    public final void test3(){

        Boolean actualResult = Task3.isNestable(new int[]{9, 9, 8}, new int[] {8, 9});

        assertThat(actualResult).isEqualTo(false);
    }
    @Test
    public final void test4(){

        Boolean actualResult = Task3.isNestable(new int[]{1, 2, 3, 4}, new int[] {2, 3});

        assertThat(actualResult).isEqualTo(false);
    }
}
