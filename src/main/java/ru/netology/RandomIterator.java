package ru.netology;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomIterator implements Iterator<Integer> {
    private final Random random;
    private final List<Integer> list;

    public RandomIterator(int min, int max) {
        list = IntStream.range(min, max).boxed().collect(Collectors.toList());
        random = new Random();

    }

    @Override
    public boolean hasNext() {
        return (list.size() > 0);
    }

    @Override
    public Integer next() {
        int size = list.size();
        if (size == 0) {
            throw new java.util.NoSuchElementException();
        }
        int idx = random.nextInt(size);
        return list.get(idx);
    }
}

