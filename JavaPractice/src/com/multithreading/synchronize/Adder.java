package com.multithreading.synchronize;

public class Adder implements Runnable {
    private Counter count;

    public Adder(Counter count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            synchronized (count) {
                count.setCount(count.getCount() + 1);
            }
        }
    }
}
