package org.example.Repository;

import java.util.HashSet;
import java.util.Set;

public class HashSetBasedRepository<T> implements InMemoryRepository<T> {
    private Set<T> set = new HashSet<>();

    @Override
    public void add(T item) {
        set.add(item);
    }

    @Override
    public boolean contains(T item) {
        return set.contains(item);
    }

    @Override
    public void remove(T item) {
        set.remove(item);
    }
}
