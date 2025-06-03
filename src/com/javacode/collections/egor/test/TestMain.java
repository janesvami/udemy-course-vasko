package com.javacode.collections.egor.test;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        Person person = new Person("Анисия", 35, DayOfWeek.FRIDAY);
        person.introduce(person.getName(), person.getAge());
        DayOfWeek favoriteDay = person.getFavoriteDayOfWeek();
        String parityOfDay = favoriteDay.isWeekend() ? "чётный" : "нечётный";

        System.out.println("Любимый день недели - " + favoriteDay + ", он " + parityOfDay);


        Cat cat = new Cat();
        Cat kitten = new Cat();
        Dog dog = new Dog();
        Dog puppy = new Dog();
        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(kitten);
        animals.add(dog);
        animals.add(puppy);

        List<String> result = speakAllAnimals(animals);
        printSpeakAllAnimals(result);

    }

    public static List<String> speakAllAnimals(List<Animal> animals) {
        List<String> animalVoices = new ArrayList<>();
        for (Animal animal : animals) {
            String voice = animal.speak();
            animalVoices.add(voice);
        }
        return animalVoices;
    }

    public static void printSpeakAllAnimals(List<String> animalVoices) {
        for (String voice : animalVoices) {
            System.out.println(voice);
        }
    }
}
