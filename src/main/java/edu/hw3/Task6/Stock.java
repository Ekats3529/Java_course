package edu.hw3.Task6;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public record Stock(String name, Integer cost) implements Comparable<Stock> {
    @Override
    public int compareTo(@NotNull Stock o) {
        return this.cost.compareTo(o.cost);
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stock stock = (Stock) o;
        return Objects.equals(name, stock.name) && Objects.equals(cost, stock.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }
}


