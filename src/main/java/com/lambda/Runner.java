package com.lambda;

import java.util.concurrent.*;

public class Runner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread thread = new Thread(new Printer());
        thread.start();

        // Inline classes which is anonymous class.
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world" + Thread.currentThread().getName());
            }
        });

        thread1.start();


        //lamda can be used only for functional interfaces. Lambda provide the behavior for fI
        Thread thread2 = new Thread(() -> System.out.println("Hello world" + Thread.currentThread().getName()));
        thread2.start();


        Future<String> cal =  Executors.newSingleThreadExecutor().submit(Runner:: print);
        System.out.println(cal.get());

    }

    public static String print() {
        System.out.println("Thread" + Thread.currentThread().getName());
        return "Hello this is sam";
    }
}
