package com.javacode.collections.egor;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {


    static Set<Integer> getCommonElements(Set<Integer> setF, Set<Integer> setS) {

        Set<Integer> newSet = new HashSet<>();
        newSet.addAll(setF);
        newSet.retainAll(setS);

        return newSet;
    }
}
