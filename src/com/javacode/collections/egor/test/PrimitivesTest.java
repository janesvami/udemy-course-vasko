package com.javacode.collections.egor.test;

import java.util.Scanner;

public class PrimitivesTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int numberA = scanner.nextInt();
        System.out.print("Введите ещё одно целое число: ");
        int numberB = scanner.nextInt();
        int resultOfComparison = compareNumbers(numberA, numberB);
        switch (resultOfComparison) {
            case 1 ->
                System.out.println("Большее число: " + numberA + "\nМеньшее число: " + numberB);
            case -1 ->
                System.out.println("Большее число: " + numberB + "\nМеньшее число: " + numberA);
            case 0 ->
                System.out.println("Введённые числа равны.");
        }

        int sum = numberA + numberB;
        System.out.println("Сумма: " + sum);
        int difference = Math.abs(numberA - numberB);
        System.out.println("Разница: " + difference);

    }
    public static int compareNumbers(int numberA, int numberB) {
        if (numberA > numberB) {
            return 1;
        } else if (numberB > numberA) {
            return -1;
        } else {
            return 0;
        }
    }
}
