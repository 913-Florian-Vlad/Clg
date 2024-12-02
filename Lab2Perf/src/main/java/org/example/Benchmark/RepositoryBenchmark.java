package org.example.Benchmark;

import org.example.Repository.*;
import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class RepositoryBenchmark {

    private InMemoryRepository<Integer> repository;

    @Param({"HashSet", "ArrayList", "TreeSet", "ConcurrentHashMap", "EclipseCollections", "Fastutil"})
    private String implementation;

    @Setup
    public void setup() {
        switch (implementation) {
            case "HashSet":
                repository = new HashSetBasedRepository<>();
                break;
            case "ArrayList":
                repository = new ArrayListBasedRepository<>();
                break;
            case "TreeSet":
                repository = new TreeSetBasedRepository<>();
                break;
            case "ConcurrentHashMap":
                repository = new ConcurrentHashMapBasedRepository<>();
                break;

        }
    }

    @Benchmark
    public void testAdd() {
        for (int i = 0; i < 1000; i++) {
            repository.add(i);
        }
    }

    @Benchmark
    public void testContains() {
        for (int i = 0; i < 1000; i++) {
            repository.contains(i);
        }
    }

    @Benchmark
    public void testRemove() {
        for (int i = 0; i < 1000; i++) {
            repository.remove(i);
        }
    }
}
