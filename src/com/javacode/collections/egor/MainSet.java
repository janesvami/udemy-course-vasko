package com.javacode.collections.egor;

import java.util.HashSet;
import java.util.Set;

import static com.javacode.collections.egor.CombineSets.combineSets;
import static com.javacode.collections.egor.CommonElements.getCommonElements;

public class MainSet {
    public static void main(String[] args) {

        Set<Integer> setFirst = new HashSet<>();
        Set<Integer> setSecond = new HashSet<>();
        setFirst.add(31);
        setFirst.add(34);
        setFirst.add(73);
        setFirst.add(856);
        setFirst.add(97);

        setSecond.add(456);
        setSecond.add(97);
        setSecond.add(856);
        setSecond.add(34);
        setSecond.add(450);
        setSecond.add(451);
        setSecond.add(452);

        Set<Integer> result = getCommonElements(setFirst, setSecond);
        System.out.println(result);

    }


}
