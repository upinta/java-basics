package com.multithreading.AdderSubstractor;

public class Substractor implements Runnable{
    private Counter count;

    public Substractor(Counter count) {
        this.count = count;
    }
    @Override
    public void run() {
        for(int i=1;i<=10000; i++){
            count.setCount(count.getCount()-1);
        }
    }
}
