package com.javacode.collections.egor.occurrences;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class OccurrencesMain {
    public static void main(String[] args) throws IOException {
        Path poemAddress = Paths.get("poetry.txt");
        byte[] byteArray = Files.readAllBytes(poemAddress);
        String poem = new String(byteArray, StandardCharsets.UTF_8);
        HashMap<String, Integer> result = findAllOccurrences(poem);
        printAllOccurrences(result);
    }

    private static HashMap<String, Integer> findAllOccurrences(String str) {

        HashMap<String, Integer> allOccurrences = new HashMap<>();
        String[] splitStr = str.split("[^a-zA-Zа-яА-Я-'ёЁ]+");
        List<String> words = Arrays.asList(splitStr);

        for (String word : words) {
            Integer numberOfOccurrences = allOccurrences.getOrDefault(word, 0);
            numberOfOccurrences++;
            allOccurrences.put(word, numberOfOccurrences);
        }
        return allOccurrences;
    }

    private static void printAllOccurrences(HashMap<String, Integer> result) {

        for (Map.Entry entry : result.entrySet()) {
            System.out.println(entry);
        }
    }
}


