package com.javacode.concurrency.producerconsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static com.javacode.concurrency.ColorScheme.GREEN;

public class ProducerConsumer {

    private static BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

    public static void main(String[] args) {


    }

    private static class Producer implements Runnable {

        String[] messages = {
                "hjghfgfg", "lkljklkj", "fdddfdg", "gvvbvb", "tytyr", "fgfgfgf"
        };
        @Override
        public void run() {
            produce();
        }

        private void produce() throws InterruptedException {
            Random r = new Random();
            for (int i = 0; i< messages.length; i++) {
                queue.put(messages[i]);
                System.out.println(GREEN);
            }
        }
    }

    private static class Consumer implements Runnable {

        @Override
        public void run() {

        }
    }
}
