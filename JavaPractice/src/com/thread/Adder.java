package com.thread;

public class Adder implements Runnable{
    private  Counter counter;
    public Adder(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i =1;i <10; i++){
            counter.setValue(counter.getValue()+i);
        }
    }
}
