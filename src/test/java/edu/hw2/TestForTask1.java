package edu.hw2;

import edu.hw2.Task1.Expr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask1 {
    @Test
    public final void test1() {

        var two = new Expr.Constant(2);
        var four = new Expr.Constant(4);
        var negOne = new Expr.Negate(new Expr.Constant(1));
        var sumTwoFour = new Expr.Addition(two, four);
        var mult = new Expr.Multiplication(sumTwoFour, negOne);
        var exp = new Expr.Exponent(mult, 2);
        var res = new Expr.Addition(exp, new Expr.Constant(1));

        double expectedResult = 37.0;

        System.out.println(res + " = " + res.evaluate());

        assertEquals(expectedResult, res.evaluate());
    }

    @Test
    public final void test2() {

        double expectedResult = 1;
        var six = new Expr.Constant(6);
        var exp = new Expr.Exponent(six, 0);

        assertEquals(expectedResult, exp.evaluate());
    }

    @Test
    public final void test3() {

        double expectedResult = 1. / 36;
        var six = new Expr.Constant(6);
        var exp = new Expr.Exponent(six, -2);

        assertEquals(expectedResult, exp.evaluate());
    }


}
