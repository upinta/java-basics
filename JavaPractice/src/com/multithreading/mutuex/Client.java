package com.multithreading.mutuex;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String args[]) throws InterruptedException {
        Counter c = new Counter(0);
        Lock lock = new ReentrantLock();

        Adder a = new Adder(c, lock);
        Substractor s = new Substractor(c, lock);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("count value is : "+c.getCount());


    }
}
