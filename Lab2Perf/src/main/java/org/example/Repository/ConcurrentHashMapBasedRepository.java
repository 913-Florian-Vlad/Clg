package org.example.Repository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConcurrentHashMapBasedRepository<T> implements InMemoryRepository<T> {
    private final Map<T, Boolean> map = new ConcurrentHashMap<>();

    @Override
    public void add(T item) {
        map.put(item, true);
    }

    @Override
    public boolean contains(T item) {
        return map.containsKey(item);
    }

    @Override
    public void remove(T item) {
        map.remove(item);
    }
}
