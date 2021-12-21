package com.josepheid.adventofcode;

import com.josepheid.adventofcode.common.Day;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
	    for (int i = 1; i <= 25; i++) {
            System.out.println("Day " + i + ":");
            Day instance = (Day) Class.forName("com.josepheid.adventofcode.days.Day" + i).getDeclaredConstructor().newInstance();
            instance.printParts();
            System.out.println();
        }
    }
}
