package edu.hw7;

import edu.hw7.Task4.MonteCarloMethod;
import edu.hw7.Task4.Result;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestForTask4 {
    @Test
    void test(){
        MonteCarloMethod monteCarloMethod = new MonteCarloMethod();
        double actualResult = monteCarloMethod.calculatePi(10000000);

        System.out.println(actualResult);
    }

    @Test
    @DisplayName("Multiple Threads are faster than Single Thread")
    void test1() {
        Result singleThreadResult = new Result();
        singleThreadResult.getResult(5, 1);
        double singleThreadTime = singleThreadResult.averageExecutingTime;

        Result multiThreadResult = new Result();
        multiThreadResult.getResult(5, 8);
        double multiThreadTime = multiThreadResult.averageExecutingTime;

        assertThat(multiThreadTime).isLessThanOrEqualTo(singleThreadTime);
    }
}
