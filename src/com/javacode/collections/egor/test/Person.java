package com.javacode.collections.egor.test;


public class Person {

    private String name;
    private int age;
    private DayOfWeek favoriteDayOfWeek;

    public Person(String name, int age, DayOfWeek favoriteDayOfWeek) {
        this.name = name;
        this.age = age;
        this.favoriteDayOfWeek = favoriteDayOfWeek;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public DayOfWeek getFavoriteDayOfWeek() {
        return favoriteDayOfWeek;
    }

    public void introduce(String name, int age) {
        System.out.println("Привет, меня зовут " + name + " , мне " + age + " лет.");
    }



}

