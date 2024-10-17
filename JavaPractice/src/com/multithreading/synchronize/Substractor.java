package com.multithreading.synchronize;

public class Substractor implements Runnable{
    private Counter count;

    public Substractor(Counter count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            synchronized (count) {
                count.setCount(count.getCount() - 1);
            }
        }
    }
}
