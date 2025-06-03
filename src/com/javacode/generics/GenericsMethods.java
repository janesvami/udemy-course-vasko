package com.javacode.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsMethods {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 0, 8, 5, 6};
        Double[] doubleArray = {0.234, 6.45, 9.034, 1.345, 4.675};
        String[] stringArray = {"abc", "vfr", "rtw", "ert"};

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);

        System.out.println("Max for array of Integers is " + findMax(intArray));
        System.out.println("Max for array of Double is " + findMax(doubleArray));
        System.out.println("Max for array of String is " + findMax(stringArray));

        Number n = Integer.valueOf(20);

//        List<Integer> intList = new ArrayList<>();
//        intList.add(1);
//        intList.add(2);
//        intList.add(3);
//        intList.add(4);

        printElements(Arrays.asList(intArray));

        MyBox<Integer> myBox = new MyBox<Integer>("");
        Double v = MyBox.<Double>returnValue(0.03);
        System.out.println(v);




    }

    private static <T> void printArray(T[] array) {
        System.out.println("Generic method called");
        for (T element : array) {
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }

    private static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T e : array) {
            if (e.compareTo(max)>0) {
                max = e;
            }
        }
        return max;
    }

    private static<E> void printElements(List<E> list) {
        for (E n : list) {
            System.out.println(n);
        }
    }
}
