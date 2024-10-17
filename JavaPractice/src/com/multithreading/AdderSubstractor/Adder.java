package com.multithreading.AdderSubstractor;

import java.util.concurrent.Callable;

public class Adder implements Runnable {
    private Counter count;
    public Adder(Counter count){
        this.count = count;
    }

    public Adder(com.multithreading.mutuex.Counter c) {
    }

    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            count.setCount(count.getCount()+1);
        }
    }
}
