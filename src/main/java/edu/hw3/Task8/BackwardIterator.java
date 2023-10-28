package edu.hw3.Task8;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BackwardIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int curIndex;

    public BackwardIterator(List<T> list) {
        this.list = list;
        this.curIndex = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return curIndex >= 0;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return list.get(curIndex--);
    }
}
