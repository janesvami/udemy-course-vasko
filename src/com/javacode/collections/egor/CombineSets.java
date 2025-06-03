package com.javacode.collections.egor;

import java.util.HashSet;
import java.util.Set;

public class CombineSets {

    static Set<Integer> combineSets(Set<Integer> setF, Set<Integer> setS) {

        Set<Integer> combinedSet = new HashSet<>();
        combinedSet.addAll(setF);
        combinedSet.addAll(setS);

        return combinedSet;
    }
}
