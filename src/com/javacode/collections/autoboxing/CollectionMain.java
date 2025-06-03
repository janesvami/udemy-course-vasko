package com.javacode.collections.autoboxing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class CollectionMain {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("aaa");

        Integer integ = 56;
        int n = integ;

        Double doub = 56.567;
        double m = doub;

        String [] colors = {"yellow", "green", "blue"};
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList(colors));
        list2.add("black");

        colors = list2.toArray(new String[list2.size()]);

        for(int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

    }
}
