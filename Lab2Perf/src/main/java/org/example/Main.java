package org.example;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws RunnerException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        Options options = new OptionsBuilder()
                .include(".*")
                .forks(1)
                .build();

        // Run the benchmarks
        new Runner(options).run();
    }
}