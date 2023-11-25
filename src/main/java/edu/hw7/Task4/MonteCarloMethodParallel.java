package edu.hw7.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class MonteCarloMethodParallel {
    private static final double RADIUS = 1;
    private static final Point CENTER = new Point(RADIUS, RADIUS);
    private static final int DEFAULT_POINTS_COUNT = 1000;

    private record Point(double x, double y) {
    }

    private double getDistance(Point a, Point b) {
        return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
    }

    private boolean isInCircle(Point point) {
        return getDistance(CENTER, point) <= RADIUS;
    }

    private int getRandomCountOfPointsInCircle() {
        int circleCount = 0;

        for (int i = 0; i < DEFAULT_POINTS_COUNT; i++) {
            Point randomPoint = getRandomPoint();
            if (isInCircle(randomPoint)) {
                circleCount++;
            }
        }
        return circleCount;
    }

    private Point getRandomPoint() {
        return new Point(
            ThreadLocalRandom.current().nextDouble(0, 2 * RADIUS),
            ThreadLocalRandom.current().nextDouble(0, 2 * RADIUS)
        );
    }

    @SuppressWarnings("MagicNumber")
    public double calculatePiAsync(int threadsAmount) {
        List<Thread> threads = new ArrayList<>();
        AtomicInteger pointsInCircle = new AtomicInteger();

        for (int i = 0; i < threadsAmount; i++) {
            threads.add(
                new Thread(() ->
                    pointsInCircle.addAndGet(
                        getRandomCountOfPointsInCircle()
                    )
                )
            );
            Thread curThread = threads.getLast();
            curThread.start();
        }

        threads.forEach(thread -> {
                try {
                    thread.join();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        );
        int totalCount = DEFAULT_POINTS_COUNT * threadsAmount;
        return 4 * ((double) pointsInCircle.get() / totalCount);
    }
}
