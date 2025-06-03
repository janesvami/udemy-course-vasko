package com.javacode.collections.egor.test;
public enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isWeekend() {
        return switch(this) {
            case SATURDAY, SUNDAY -> true;
            default -> false;
        };
    }
    boolean isEven() {
        return switch(this) {
            case TUESDAY, THURSDAY, SATURDAY -> true;
            default -> false;
        };
    }
}
