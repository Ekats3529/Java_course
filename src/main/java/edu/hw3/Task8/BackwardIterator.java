package edu.hw3.Task8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BackwardIterator<E> implements Iterator<E> {
    private List<E> collection;
    private int curIndex;

    public BackwardIterator(Collection<E> collection) {
        this.collection = List.copyOf(collection);
        this.curIndex = collection.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return curIndex >= 0;
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return collection.get(curIndex--);
    }
}
