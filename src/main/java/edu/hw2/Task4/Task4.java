package edu.hw2.Task4;

public class Task4 {

    private Task4() {
    }

    public static CallingInfo callingInfo() {
        var stackTrace = Thread.currentThread().getStackTrace();

        String className = stackTrace[1].getClassName();
        String methodName = stackTrace[1].getMethodName();
        return new CallingInfo(className, methodName);
    }
}
