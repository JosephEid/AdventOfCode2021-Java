package com.josepheid.adventofcode.days;

import com.josepheid.adventofcode.common.Day;

public class Day1 extends Day {

    public Day1() {
        super(1);
    }

    public static void main(String[] args) {
        new Day1().printParts();
    }

    @Override
    public Object part1() {
        long[] input = inputAsNumbers();
        int result = 0;
        for(int i = 1; i<input.length; i++){
            if(input[i-1] < input[i]){
                result++;
            }
        }
        return result;
    }

    @Override
    public Object part2() {
        long[] input = inputAsNumbers();
        int result = 0;
        for(int i = 3; i<input.length; i++){
            if(input[i-3] + input[i-2] + input[i-1] < input[i] + input[i-2] + input[i-1]){
                result++;
            }
        }
        return result;
    }
}
