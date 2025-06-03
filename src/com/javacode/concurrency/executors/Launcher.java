package com.javacode.concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import static com.javacode.concurrency.ColorScheme.RED;

public class Launcher {
    private static final int POOL_SIZE = 2;

    public static void main(String[] args) throws InterruptedException {
        boolean isDaemon = true;

        System.out.println(RED + "Starting the main thread");
        GCDRunnable r = new GCDRunnable(isDaemon);

//        runInOneThread(r, isDaemon);
        runWithExecutors(r, true);
        System.out.println(RED + "Leaving the main thread");

    }

//    private static void runInOneThread(GCDRunnable r, boolean isDaemon) throws InterruptedException {
//        Thread th = new Thread(r);
//        if (isDaemon) {
//            th.setDaemon(true);
//        }
//        th.start();

//        Thread.sleep(100);
//        th.interrupt();
//    }

    private static void runWithExecutors(GCDRunnable r, boolean isDeamon) throws InterruptedException {

        ThreadFactory factory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                if (isDeamon) {
                    thread.setDaemon(true);
                }
                return thread;
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(POOL_SIZE, factory);
        for (int i = 0; i <5; i++) {
            executorService.execute(r);
        }
        executorService.shutdown();
        executorService.awaitTermination(30, TimeUnit.SECONDS);
    }
}
