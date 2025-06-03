package com.javacode.collections.egor.test;


public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        int result = 31 * id;
        return result;
    }

    @Override
    public String toString() {
        return name + " " + id + "\n";
    }
}
