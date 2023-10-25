package edu.hw2;

import edu.hw2.Task4.CallingInfo;
import edu.hw2.Task4.Task4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask4 {
    @Test
    public final void test1() {
        CallingInfo callingInfo = Task4.callingInfo();

        String className = callingInfo.className();
        String methodName = callingInfo.methodName();

        assertEquals("edu.hw2.Task4.Task4", className);
        assertEquals("callingInfo", methodName);

    }

    @Test
    public final void test2() {
        var stackTrace = Thread.currentThread().getStackTrace();

        String className = stackTrace[1].getClassName();
        String methodName = stackTrace[1].getMethodName();

        CallingInfo callingInfo = new CallingInfo(className, methodName);

        assertEquals("edu.hw2.TestForTask4", callingInfo.className());
        assertEquals("test2", callingInfo.methodName());

    }
}
