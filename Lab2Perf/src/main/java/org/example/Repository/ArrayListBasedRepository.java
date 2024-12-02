package org.example.Repository;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasedRepository<T> implements InMemoryRepository<T> {
    private List<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public boolean contains(T element) {
        return list.contains(element);
    }

    public void remove(T element) {
        list.remove(element);
    }
}