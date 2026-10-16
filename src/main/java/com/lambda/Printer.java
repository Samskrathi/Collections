package com.lambda;

public class Printer implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello world" + Thread.currentThread().getName());
    }
}
