package com.josepheid.adventofcode.days;

import com.josepheid.adventofcode.common.Day;

public class Day2 extends Day {

    public Day2() {
        super(2);
    }

    public static void main(String[] args) {
        new Day1().printParts();
    }

    @Override
    public Object part1() {
        String[] input = inputAsStream().toArray(String[]::new);

        int horiz = 0;
        int depth = 0;
        int aim = 0;

        for (int i = 0; i<input.length; i++) {
            String command = input[i];
            String[] strings = command.split(" ");
            String move = strings[0];
            int distance = Integer.valueOf(strings[1]);

            switch (move) {
                case "forward":
                    horiz += distance;
                    break;
                case "up":
                    depth -= distance;
                    break;
                case "down":
                    depth += distance;
                    break;
            }
        }

        return horiz * depth;
    }

    @Override
    public Object part2() {
        String[] input = inputAsStream().toArray(String[]::new);

        int horiz = 0;
        int depth = 0;
        int aim = 0;

        for (int i = 0; i<input.length; i++) {
            String command = input[i];
            String[] strings = command.split(" ");
            String move = strings[0];
            int distance = Integer.valueOf(strings[1]);

            switch (move) {
                case "forward":
                    horiz += distance;
                    depth += aim * distance;
                    break;
                case "up":
                    aim -= distance;
                    break;
                case "down":
                    aim += distance;
                    break;
            }
        }

        return horiz * depth;
    }
}
