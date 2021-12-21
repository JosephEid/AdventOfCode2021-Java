package com.josepheid.adventofcode.common;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public abstract class Day {
    private final int day;
    public static final String DEFAULT_DELIMITER = "\n";
    protected int example = 0;

    public Day(int day) {
        this.day = day;
    }

    public static String getResourceAsString(String resource) {
        try {
            Path path = Paths.get(resource);
            return Files.readString(path.toAbsolutePath());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public abstract Object part1();

    public abstract Object part2();

    public void printParts() {
        System.out.println("Part 1: " + part1());
        System.out.println("Part 2: " + part2());
    }

    protected long[] inputAsNumbers() {
        return inputAsNumbers(DEFAULT_DELIMITER);
    }

    protected long[] inputAsNumbers(String delimiter) {
        return inputAsNumbersStream(delimiter).toArray();
    }

    protected LongStream inputAsNumbersStream() {
        return inputAsNumbersStream(DEFAULT_DELIMITER);
    }

    protected LongStream inputAsNumbersStream(String delimiter) {
        return inputAsStream(delimiter).filter(e -> !e.isEmpty()).map(e -> e.replace("\n", "").trim()).mapToLong(Long::parseLong);
    }

    protected Stream<String> inputAsStream() {
        return inputAsStream(DEFAULT_DELIMITER);
    }

    protected Stream<String> inputAsStream(String delimiter) {
        return Arrays.stream(day().split(delimiter));
    }

    protected String day() {
        boolean b = example != 0;
        return getResourceAsString("src/com/josepheid/adventofcode/inputs/Day" + day + ".txt");
    }
}
