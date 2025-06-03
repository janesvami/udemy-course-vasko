package com.javacode.collections.egor.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsTest {
    public static void main(String[] args) {

       divideNumbers();

    }

    public static int divideNumbers() {

        int resultOfDivide = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            int numberA = scanner.nextInt();
            System.out.print("Введите ещё одно целое число: ");
            int numberB = scanner.nextInt();
            resultOfDivide = numberA / numberB;
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя.");
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод данных.");
        } finally {
            System.out.println("Программа завершена.");
        }


        return resultOfDivide;
    }
}

