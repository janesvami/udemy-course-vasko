package com.javacode.concurrency.volatilelesson;

import static com.javacode.concurrency.ColorScheme.GREEN;
import static com.javacode.concurrency.ColorScheme.RED;

public class VolatileMain {
    private static volatile int counter;
    private static int x;
    private static int y;

    public static void main(String[] args) {

        new SimpleWriter().start();
        new SimpleReader().start();

    }


    private static class SimpleWriter extends Thread {

        private static void update() {
            counter++;
            x++;
            y++;
        }
        @Override
        public void run() {
            int localCounter = counter;
            for (int i = 0; i < 10; i++) {
                System.out.println(GREEN + "Writer increments counter " + (localCounter + 1));
                counter = ++localCounter;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    private static class SimpleReader extends Thread {
        @Override
        public void run() {
            int localCounter = counter;
            for (int i = 0; i < 10; i++) {
                while (localCounter < 10) {
                    if (localCounter != counter) {
                        System.out.println(RED + "Reader reads counter " + counter);
                        localCounter = counter;
                    }
                }
            }
        }
    }
}
