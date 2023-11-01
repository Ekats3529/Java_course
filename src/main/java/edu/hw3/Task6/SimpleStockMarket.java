package edu.hw3.Task6;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SimpleStockMarket implements StockMarket {
    public static final Comparator<Stock> COAST_COMPARATOR = Comparator
        .comparingDouble(Stock::cost)
        .reversed();
    private final PriorityQueue<Stock> stockPriorityQueue = new PriorityQueue<>(COAST_COMPARATOR);

    @Override
    public void add(Stock stock) {
        stockPriorityQueue.add(stock);
    }

    @Override
    public void remove(Stock stock) {
        stockPriorityQueue.remove(stock);
    }

    @Override
    public Stock mostValuableStock() {
        return stockPriorityQueue.peek();
    }
}
