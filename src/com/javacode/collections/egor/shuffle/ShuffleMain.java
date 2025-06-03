package com.javacode.collections.egor.shuffle;

import java.io.*;
import java.util.Scanner;

public class ShuffleMain {

    public static void main(String[] args) {

        File fileA = new File("Таня.txt");
        File fileB = new File("Питер.txt");
        File shuffledFile = new File("Shuffled.txt");
        File sequenceFile = new File("Sequence.txt");

        shuffleFiles(fileA, fileB);
        decryptShuffled(shuffledFile, sequenceFile);

    }

    public static void shuffleFiles(File fileA, File fileB) {

        try (Scanner scannerA = new Scanner(fileA);
             Scanner scannerB = new Scanner(fileB);
             BufferedWriter writerShuffled = new BufferedWriter(new FileWriter("Shuffled.txt", true));
             BufferedWriter writerSequence = new BufferedWriter(new FileWriter("Sequence.txt", true))) {

            while (scannerA.hasNextLine() && scannerB.hasNextLine()) {
                boolean flipResult = flipACoin();
                String luckyString = flipResult ? scannerA.nextLine() : scannerB.nextLine();
                String letterSequence = flipResult ? "F" : "S";
                writerShuffled.write(luckyString + "\n");
                writerSequence.write(letterSequence);
            }

            while (scannerA.hasNextLine() || scannerB.hasNextLine()) {
                String lastShuffled = scannerA.hasNextLine() ? scannerA.nextLine() : scannerB.nextLine();
                String lastSequence = scannerA.hasNextLine() ? "F" : "S";
                writerShuffled.write(lastShuffled + "\n");
                writerSequence.write(lastSequence);
            }
        } catch (IOException e) {
            System.out.println("File cannot be opened. Program terminates");
            e.printStackTrace();
        }

    }

    private static boolean flipACoin() {
        int minValue = 1;
        int maxValue = 10;
        int randomNumber = minValue + (int) (Math.random() * maxValue);
        return switch (randomNumber) {
            case 1, 2, 3, 4, 5 -> false;
            case 6, 7, 8, 9, 10 -> true;
            default -> throw new IllegalStateException("Unexpected value: " + randomNumber);
        };
    }

    private static void decryptShuffled(File shuffledFile, File sequenceFile) {
        try (Scanner scannerShuffled = new Scanner(shuffledFile);
             Scanner scannerSequence = new Scanner(sequenceFile);
             BufferedWriter writerA = new BufferedWriter(new FileWriter("NewFileA.txt", true));
             BufferedWriter writerB = new BufferedWriter(new FileWriter("NewFileB.txt", true))) {

            String letterForA = "F";
            String letterForB = "S";
            String sequenceLine = scannerSequence.nextLine();
            String[] sequenceLetters = sequenceLine.split("");

            for (String letter : sequenceLetters) {
                if (letter.equals(letterForA)) {
                    writerA.write(scannerShuffled.nextLine() + "\n");
                } else if (letter.equals(letterForB)) {
                    writerB.write(scannerShuffled.nextLine() + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("File cannot be opened. Program terminates");
            e.printStackTrace();
        }

    }
}
