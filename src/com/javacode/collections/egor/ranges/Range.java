package com.javacode.collections.egor.ranges;

import java.util.Objects;

public class Range implements Comparable<Range> {
    private final int begin;
    private final int end;

    public Range(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    public int getBegin() {
        return begin;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Range " + begin + "-" + end;
    }

    @Override
    public int compareTo(Range range) {

        if (begin < range.getBegin()) {
            return -1;
        }
        if (begin > range.getBegin()) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Range range = (Range) o;
        return begin == range.begin && end == range.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(begin, end);
    }
}
