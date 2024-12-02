package org.example.Repository;

import java.util.Set;
import java.util.TreeSet;
public class TreeSetBasedRepository<T> implements InMemoryRepository<T> {
    private Set<T> set = new TreeSet<>();

    public void add(T element) {
        set.add(element);
    }

    public boolean contains(T element) {
        return set.contains(element);
    }

    public void remove(T element) {
        set.remove(element);
    }
}