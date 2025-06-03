package com.javacode.collections.egor.users;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserMain {
    public static void main(String[] args) {

        User ivanov = new User("Ivanov", 1245);
        User petrov = new User("Petrov", 5764);
        User sidorov = new User("Sidorov", 5454);
        User ivanovS = new User("Ivanov", 2454);
        User krokhin = new User("Krokhin", 3254);
        User burmistrov = new User("Burmistrov", 7441);
        User krokhinS = new User("Krokhin", 8421);
        User cherkashin = new User("Cherkashin", 6564);
        User paramonov = new User("Paramonov", 1222);
        User paramonovS = new User("Paramonov", 3564);

        List<User> users = new ArrayList<>();
        users.add(0, ivanov);
        users.add(1, petrov);
        users.add(2, sidorov);
        users.add(3, ivanovS);
        users.add(4, krokhin);
        users.add(5, burmistrov);
        users.add(6, krokhinS);
        users.add(7, cherkashin);
        users.add(8, paramonov);
        users.add(9, paramonovS);

        List<User> result = removeBanality(users);
        printUsers(result);
    }
    private static List<User> removeBanality(List<User> users) {
        Set<String> forbiddenSurnames = new HashSet<>(Set.of("Ivanov", "Petrov", "Sidorov"));
        List<User> newList = new ArrayList<>();

        for (User user : users) {
            boolean isAdded = forbiddenSurnames.add(user.getSurname());
            if (isAdded) {
                newList.add(user);
            }
        }
        return newList;
    }

    private static void printUsers(List<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
