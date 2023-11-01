package edu.hw3;

import edu.hw3.Task6.SimpleStockMarket;
import edu.hw3.Task6.Stock;
import edu.hw3.Task6.StockMarket;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask6 {
    @Test
    void test1() {
        StockMarket stockMarket = new SimpleStockMarket();
        stockMarket.add(new Stock("Yandex", 2500));
        stockMarket.add(new Stock("Gazprom", 200));
        stockMarket.add(new Stock("Tinkoff", 3000));

        Stock stock = stockMarket.mostValuableStock();

        assertEquals(stock, new Stock("Tinkoff", 3000));
    }

    @Test
    void test2() {
        StockMarket stockMarket = new SimpleStockMarket();
        Stock googleStock = new Stock("Google", 1000);
        Stock yandexStock = new Stock("Yandex", 500);
        stockMarket.add(yandexStock);
        stockMarket.add(googleStock);

        Stock stock = stockMarket.mostValuableStock();

        assertEquals(stock, googleStock);

        stockMarket.remove(googleStock);

        stock = stockMarket.mostValuableStock();

        assertEquals(stock, yandexStock);
    }
}
