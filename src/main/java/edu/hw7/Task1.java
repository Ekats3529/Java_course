package edu.hw7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Task1 {
    private Task1() {
    }

    public static int incrementParallel(int num, int threads) throws InterruptedException {
        List<Thread> threadList = new ArrayList<>();
        var res = new AtomicInteger(num);

        for (int i = 0; i < threads; i++) {
            threadList.add(new Thread(res::incrementAndGet));
            Thread curThread = threadList.get(threadList.size() - 1);
            curThread.start();
        }

        threadList.forEach(thread -> {
                try {
                    thread.join();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        );

        return res.get();

}
}
