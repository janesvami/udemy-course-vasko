package com.javacode.collections.egor.ranges;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RangeMain {
    public static void main(String[] args) {

        Range one = new Range(1, 8);
        Range two = new Range(2, 6);
        Range three = new Range(3, 10);
        Range four = new Range(1, 12);
        Range five = new Range(3, 19);
        Range six = new Range(6, 28);
        Range seven = new Range(14, 45);
        Range eight = new Range(23, 68);
        Range nine = new Range(33, 105);
        Range ten = new Range(69, 90);

        List<Range> ranges = new ArrayList<>();
        ranges.add(one);
        ranges.add(two);
        ranges.add(three);
        ranges.add(four);
        ranges.add(five);
        ranges.add(six);
        ranges.add(seven);
        ranges.add(eight);
        ranges.add(nine);
        ranges.add(ten);

        boolean isTHereIntersection = findRangesIntersections(ranges);
        System.out.println(isTHereIntersection);
        printRanges(ranges);

    }


    private static boolean findRangesIntersections(List<Range> ranges) {

        Range previous = null;
        Set<Range> sortedRanges = new TreeSet<>(ranges);

        for (Range range : sortedRanges) {
            if (previous != null) {
                if (range.getBegin() <= previous.getEnd() ) {
                    return true;
                }
            }
            previous = range;
        }
        return false;
    }
    private static void printRanges(List<Range> ranges) {
        for (Range range : ranges) {
            System.out.println(range);
        }

    }
}
