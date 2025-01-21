package com.thread;

public class Substractor implements Runnable {
    private  Counter counter;
    public Substractor(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i =0;i <10000; i++){
            counter.setValue(counter.getValue()-i);
        }
    }
}
