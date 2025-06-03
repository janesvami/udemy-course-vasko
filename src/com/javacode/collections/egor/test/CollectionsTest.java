package com.javacode.collections.egor.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Анисия");
        names.add("Феофания");
        names.add("Егор");
        names.add("Илья");
        names.add("Олег");
        names.add("Вениамин");

        ComparatorNames comparatorNames = new ComparatorNames();
        Collections.sort(names, comparatorNames);
        printNames(names);

    }
    public static void printNames(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
