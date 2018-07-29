package main.java.com.pczapski.patterns.behavioral.iterator;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {

    private String[] items = new String[]{"A", "B", "C"};

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < items.length && items[index] != null;
            }

            @Override
            public String next() {
                return items[index++];
            }
        };
    }
}
