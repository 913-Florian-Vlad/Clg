package org.example.Repository;

public interface InMemoryRepository<T> {
    void add(T element);
    boolean contains(T element);
    void remove(T element);
}