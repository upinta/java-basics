package com.multithreading.synchronize;

public class Counter {
    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public synchronized void incrementCount(int count) {
        this.count+=count;
    }

    public synchronized void decrementCount(int count) {
        this.count-=count;
    }

}
