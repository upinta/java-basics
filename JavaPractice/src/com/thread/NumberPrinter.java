package com.thread;

public class NumberPrinter implements Runnable{

    private int i;
    public NumberPrinter(int i) {
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println("number is : "+i + Thread.currentThread().getName());
    }
}
