package com.javacode.collections.egor.test;

public record Book(int id, String title, String author) {

    @Override
    public String toString() {
        return "«" + title + "» (" + author + ")";
    }
}
