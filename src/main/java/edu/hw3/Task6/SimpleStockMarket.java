package edu.hw3.Task6;

import java.util.Collections;
import java.util.PriorityQueue;

public class SimpleStockMarket implements StockMarket {
    private final PriorityQueue<Stock> stockPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());

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
