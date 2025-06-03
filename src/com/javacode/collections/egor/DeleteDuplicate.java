package com.javacode.collections.egor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteDuplicate {

    static List<String> deleteDuplicate(List<String> list) {

        Set<String> set = new HashSet<>(list);
        List<String> newList = new ArrayList<>();
        newList.addAll(set);

        return newList;
    }
}
