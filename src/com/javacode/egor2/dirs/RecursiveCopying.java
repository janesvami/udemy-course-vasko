package com.javacode.egor2.dirs;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class RecursiveCopying {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Нися\\IdeaProjects\\CodeSampleProject\\x\\source.txt");
        recursiveCopy(path);
    }

    private static void recursiveCopy(Path path) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int number = scanner.nextInt();
        if (number < 1 || number > 5) {
            System.out.println("Вы ввели число за пределами указанного диапазона. Пожалуйста, введите число от 1 до 5");
            scanner.nextInt();
        } else {
            Path dirPath = Path.of(".\\");

            recursiveBase(path, dirPath, number, 1, 1);
        }
    }

    private static void recursiveBase(Path path, Path dirPath, int number, int currentDirCount, int step) throws IOException {


        if (currentDirCount > number) {
            return;
        }
        int level = currentDirCount;
        String end = "copy.txt";
        Path resolve = dirPath.resolve(level + "." + step);
        Path newDir = Files.createDirectories(resolve);
        Path newFile = newDir.resolve(end);

        Files.copy(path, newFile, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Файл скопирован в новую папку " + newFile);
        level++;


        for (int i = 1; i <= level; i++) {
            recursiveBase(path, newDir, number, level, i);

        }
        System.out.println("End of currentDirCount = " + currentDirCount + ", step = " + step);

    }


}

