package edu.java.exceptionhandling;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.LongStream;

public class RandomGenerator {

    public static void main(String[] args) {
        System.out.println("Random double number: "+getRandomDouble(10,888.09, false, 2));
        System.out.println("Random long array: "+ Arrays.toString(getRandomLongNumbers(100, 900, true, 30, true)));
    }

    // Prior to Java 8
    private static double getRandomDouble(final double lowerBound, final double upperBound, final boolean inclusiveRange, final int roundOffDigits) {
        // Math.random() returns a rational number between 0.0 and 1.0. Right bound excluded
        final double randomDouble = Math.random()*(upperBound-lowerBound+(inclusiveRange?1:0))+lowerBound;
        final double powerOf10 = Math.pow(10.0,roundOffDigits);
        return Math.round(randomDouble*powerOf10)/powerOf10;
    }

    // Java 8 onwards
    private static long[] getRandomLongNumbers(final long lowerBound, final long upperBound, final boolean inclusiveRange, final int count, final boolean sorted) {
        final LongStream longStream = new Random().longs(count, lowerBound, inclusiveRange?upperBound+1:upperBound);
        return sorted?longStream.sorted().toArray():longStream.toArray();
    }
}