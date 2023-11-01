package edu.hw3;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask1 {

    Task1 task1 = new Task1();

    @Test
    public final void test1() {

        var actualResult = task1.atbash("Hello world!");

        String expectedResult = "Svool dliow!";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public final void test2() {

        var actualResult = task1.atbash("Any fool can write code that a computer can understand. Good programmers " +
            "write code that humans can understand. ― Martin Fowler");

        String expectedResult = "Zmb ullo xzm dirgv xlwv gszg z xlnkfgvi xzm fmwvihgzmw. Tllw kiltiznnvih dirgv xlwv " +
            "gszg sfnzmh xzm fmwvihgzmw. ― Nzigrm Uldovi";

        assertEquals(expectedResult, actualResult);
    }
}
