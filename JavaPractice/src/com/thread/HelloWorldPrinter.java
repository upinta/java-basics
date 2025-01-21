package com.thread;

public class HelloWorldPrinter implements Runnable {

    public HelloWorldPrinter() {

    }

    @Override
    public void run(){
        System.out.println("Hello world : "+ Thread.currentThread().getName());
    }
}
