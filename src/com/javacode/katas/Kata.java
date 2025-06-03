package com.javacode.katas;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Kata {

    public static void main(String[] args) {
        String str1 = "the_Stealth_ Warrior^*";
        String str2 = "internationalization";
        String str3 = "Anisiya likes you";
        String str4 = "the_stealth_warrior";
        String result = abbreviate(str3);
        System.out.println(result);

//        String[] arr = abbreviate(str1);
//        printArr(arr);
    }

    public static String abbreviate(String string) {

        String[] words = string.split("[^A-Za-zА-Яа-я]");
        List<String> symbols = new ArrayList<>(List.of(string.split("[A-Za-zА-Яа-я]")));
        List<String> newWords = getAbbrs(words);
        symbols.removeIf(String::isEmpty);
        newWords.removeIf(String::isEmpty);
        List<String> abbrs = new ArrayList<>();
        boolean letter = Character.isLetter(string.charAt(0));


        StringBuilder stringBuilder = new StringBuilder();
        for (String elem : newWords) {
            stringBuilder.append(elem);
        }
        return stringBuilder.toString();
    }

    private static List<String> getAbbrs(String[] words) {
        List<String> newWords = new ArrayList<>();
        for (String word : words) {
            int numberForAbbr = word.length();
            if (numberForAbbr > 3) {
                String[] letters = word.split("");
                String abbr = letters[0].concat(String.valueOf(numberForAbbr - 2)).concat(letters[word.length() - 1]);
                newWords.add(abbr);
            } else {
                newWords.add(word);
            }
        }
        return newWords;
    }

    public static void printArr(String[] arr) {
        for (String elem : arr) {
            System.out.println(elem);
        }
    }
}



