package com.multithreading.mutuex;

import java.util.concurrent.locks.Lock;

public class Substractor implements Runnable {
    private Counter count;
    private Lock lock;

    public Substractor(Counter count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            lock.lock();
            count.setCount(count.getCount()-1);
            lock.unlock();
        }
    }
}
