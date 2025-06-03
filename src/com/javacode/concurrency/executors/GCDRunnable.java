package com.javacode.concurrency.executors;

import java.util.Random;

import static com.javacode.concurrency.ColorScheme.BLUE;
import static com.javacode.concurrency.ColorScheme.GREEN;

public class GCDRunnable extends Random implements Runnable {

    public GCDRunnable(boolean isDaemon) {
    }

    @Override
    public void run() {
        String threadDescription = Thread.currentThread().getName();

        System.out.println(BLUE + "Starting " + threadDescription);
        for (int i = 0; i < 10000000; i++) {
            int a = nextInt();
            int b = nextInt();

            if (i % 10000 == 0) {
                if (!Thread.interrupted()) {
                    int gcd = computeGCD(a, b);
                    if (gcd > 5) {
                        System.out.println(GREEN + "Running in" + threadDescription + ". The GCD of " + a + " and " + b + " is " + gcd);
                    }
                } else {
                    System.out.println(BLUE + "Thread was interrupted");
                    return;
                }
            }
        }
        System.out.println(BLUE + "Leaving the thread " + threadDescription);
    }

    private int computeGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        } else {
            return computeGCD(number2, number1 % number2);
        }
    }

}
